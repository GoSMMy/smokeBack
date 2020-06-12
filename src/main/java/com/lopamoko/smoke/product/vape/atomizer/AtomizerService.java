package com.lopamoko.smoke.product.vape.atomizer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AtomizerService {
    Mono<Atomizer> get(String atomizerId);
    Mono<Atomizer> update(Atomizer atomizer);
    Mono<Void> remove(String atomizerId);
    Flux<Atomizer> find(AtomizerRequest atomizerRequest);
    Mono<Atomizer> create(Atomizer atomizer);
}
