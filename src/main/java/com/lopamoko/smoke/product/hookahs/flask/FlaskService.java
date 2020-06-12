package com.lopamoko.smoke.product.hookahs.flask;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FlaskService {
    Mono<Flask> create(Flask flask);
    Mono<Flask> get(String flaskId);
    Flux<Flask> getAll();
    Mono<Flask> update(Flask flask);
    Mono<Void> remove(String flaskId);
}
