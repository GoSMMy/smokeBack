package com.lopamoko.smoke.product.hookahs.hose;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HoseService {
    Mono<Hose> create(Hose hose);
    Mono<Hose> get(String hoseId);
    Flux<Hose> getAll();
    Mono<Hose> update(Hose hose);
    Mono<Void> remove(String hoseId);
}
