package com.lopamoko.smoke.product.hookahs.valve;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ValveService {
    Mono<Valve> create(Valve valve);
    Mono<Valve> get(String valveId);
    Flux<Valve> getAll();
    Mono<Valve> update(Valve valve);
    Mono<Void> remove(String valveId);
}
