package com.lopamoko.smoke.product.hookahs.body;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BodyService {
    Mono<Body> create(Body body);
    Mono<Body> get(String bodyId);
    Flux<Body> getAll();
    Mono<Body> update(Body body);
    Mono<Void> remove(String bodyId);
}
