package com.lopamoko.smoke.product.hookahs.cup;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CupService {
    Mono<Cup> create(Cup cup);
    Mono<Cup> get(String cupId);
    Flux<Cup> getAll();
    Mono<Cup> update(Cup cup);
    Mono<Void> remove(String cupId);
}
