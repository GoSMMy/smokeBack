package com.lopamoko.smoke.product.hookahs.saucer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SaucerService {
    Mono<Saucer> create(Saucer saucer);
    Mono<Saucer> get(String saucerId);
    Flux<Saucer> getAll();
    Mono<Saucer> update(Saucer saucer);
    Mono<Void> remove(String saucerId);
}
