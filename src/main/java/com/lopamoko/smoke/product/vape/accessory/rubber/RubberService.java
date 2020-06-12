package com.lopamoko.smoke.product.vape.accessory.rubber;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RubberService {
    Mono<Rubber> create(Rubber rubber);
    Mono<Rubber> get(String rubberId);
    Flux<Rubber> getAll();
    Mono<Rubber> update(Rubber rubber);
    Mono<Void> remove(String rubberId);
}
