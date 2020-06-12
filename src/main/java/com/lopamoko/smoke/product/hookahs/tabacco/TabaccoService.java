package com.lopamoko.smoke.product.hookahs.tabacco;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TabaccoService {
    Mono<Tabacco> create(Tabacco tabacco);
    Mono<Tabacco> get(String tabaccoId);
    Flux<Tabacco> getAll();
    Mono<Tabacco> update(Tabacco tabacco);
    Mono<Void> remove(String tabaccoId);
}
