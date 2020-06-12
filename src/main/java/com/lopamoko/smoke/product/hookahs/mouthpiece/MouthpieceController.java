package com.lopamoko.smoke.product.hookahs.mouthpiece;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hookahs/mouthpiece")
@RequiredArgsConstructor
public class MouthpieceController {
    private final MouthpieceService mouthpieceService;

    @GetMapping("/{id}")
    public Mono<Mouthpiece> get(@PathVariable("id") String mouthpieceId) {
        return mouthpieceService.get(mouthpieceId);
    }

    @PostMapping
    public Mono<Mouthpiece> create(@RequestBody Mouthpiece mouthpiece) {
        return mouthpieceService.create(mouthpiece);
    }

    @PutMapping
    public Mono<Mouthpiece> update(@RequestBody Mouthpiece mouthpiece) {
        return mouthpieceService.update(mouthpiece);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String mouthpieceId) {
        return mouthpieceService.remove(mouthpieceId);
    }

    @GetMapping
    public Flux<Mouthpiece> getAll() {
        return mouthpieceService.getAll();
    }
}
