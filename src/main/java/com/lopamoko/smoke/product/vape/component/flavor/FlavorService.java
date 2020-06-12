package com.lopamoko.smoke.product.vape.component.flavor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FlavorService {
    Mono<Flavor> create(Flavor flavor);
    Mono<Flavor> get(String flavorId);
    Flux<Flavor> getAll();
    Mono<Flavor> update(Flavor flavor);
    Mono<Void> remove(String flavorId);
}
