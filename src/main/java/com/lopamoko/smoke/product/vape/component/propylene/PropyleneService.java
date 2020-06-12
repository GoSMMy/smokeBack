package com.lopamoko.smoke.product.vape.component.propylene;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PropyleneService {
    Mono<Propylene> create(Propylene propylene);
    Mono<Propylene> get(String propyleneId);
    Flux<Propylene> getAll();
    Mono<Propylene> update(Propylene propylene);
    Mono<Void> remove(String propyleneId);
}
