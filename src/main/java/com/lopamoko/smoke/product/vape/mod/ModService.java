package com.lopamoko.smoke.product.vape.mod;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ModService {
    Mono<Mod> create(Mod mod);
    Mono<Mod> update(Mod mod);
    Mono<Void> remove(String modId);
    Mono<Mod> get(String modId);
    Flux<Mod> find(ModRequest modRequest);
}
