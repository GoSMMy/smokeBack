package com.lopamoko.smoke.product.vape.liquid;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LiquidService {
    Flux<Liquid> findAll(LiquidRequest liquidRequest);
    Mono<Liquid> findById(String id);
    Mono<Liquid> create(Liquid liquid);
    Mono<Void> remove(String id);
    Mono<Liquid> update(String liquidId, Liquid liquid);
}
