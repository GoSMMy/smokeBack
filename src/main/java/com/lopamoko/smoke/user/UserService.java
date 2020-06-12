package com.lopamoko.smoke.user;

import com.lopamoko.smoke.security.Encoder;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService implements ReactiveUserDetailsService {
    private final UserRepository userRepository;
    private final UserEntityToUserConverter userEntityToUserConverter;
    private final UserToUserEntityConverter userToUserEntityConverter;
    private final Encoder encoder;

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return userRepository.findByUsername(username)
                .log()
                .switchIfEmpty(Mono.defer(() -> Mono.error(new UsernameNotFoundException(username))))
                .cast(UserDetails.class);
    }

    public Mono<UserDetails> createUser(User user) {
        UserEntity userEntity = userToUserEntityConverter.convert(user);
        userEntity.setPassword(encoder.encode(userEntity.getPassword()));
        return userRepository.save(userEntity).cast(UserDetails.class);
    }

    public Flux<User> find() {
        return userRepository.findAll()
                .map(userEntityToUserConverter::convert);
    }
}
