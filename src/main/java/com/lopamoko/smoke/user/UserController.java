package com.lopamoko.smoke.user;

import com.lopamoko.smoke.security.AuthRequest;
import com.lopamoko.smoke.security.AuthResponse;
import com.lopamoko.smoke.security.Encoder;
import com.lopamoko.smoke.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final Encoder encoder;
    private final UserService userService;
    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public Mono<ResponseEntity<?>> login(@RequestBody AuthRequest ar) {
        return userService.findByUsername(ar.getUsername())
                .map((userDetails) -> {
                    if (encoder.encode(ar.getPassword()).equals(userDetails.getPassword())) {
                        return ResponseEntity.ok(new AuthResponse(jwtUtil.generateToken(userDetails)));
                    } else {
                        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
                    }
                }).defaultIfEmpty(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }

    @PostMapping("/register")
    public Mono<UserDetails> register(@RequestBody AuthRequest authRequest) {
        return userService.createUser(new User()
                .setUsername(authRequest.getUsername())
                .setPassword(authRequest.getPassword())
                .setFirstName(authRequest.getFirstName())
                .setSecondName(authRequest.getSecondName())
                .setAge(authRequest.getAge())
                .setEmail(authRequest.getEmail()));
    }
}
