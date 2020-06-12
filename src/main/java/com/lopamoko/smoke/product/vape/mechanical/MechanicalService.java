package com.lopamoko.smoke.product.vape.mechanical;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MechanicalService {
    Mono<Mechanical> create(Mechanical mechanical);
    Mono<Mechanical> get(String mechanicalId);
    Flux<Mechanical> getAll();
    Mono<Mechanical> update(Mechanical mechanical);
    Mono<Void> remove(String mechanicalId);
}
