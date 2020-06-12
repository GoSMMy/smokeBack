package com.lopamoko.smoke.product.vape.component.glycerol;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GlycerolService {
    Mono<Glycerol> create(Glycerol glycerol);
    Mono<Glycerol> get(String glycerolId);
    Flux<Glycerol> getAll();
    Mono<Glycerol> update(Glycerol glycerol);
    Mono<Void> remove(String glycerolId);
}
