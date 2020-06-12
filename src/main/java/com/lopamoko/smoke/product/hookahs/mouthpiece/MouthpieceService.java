package com.lopamoko.smoke.product.hookahs.mouthpiece;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MouthpieceService {
    Mono<Mouthpiece> create(Mouthpiece mouthpiece);
    Mono<Mouthpiece> get(String mouthpieceId);
    Flux<Mouthpiece> getAll();
    Mono<Mouthpiece> update(Mouthpiece mouthpiece);
    Mono<Void> remove(String mouthpieceId);
}
