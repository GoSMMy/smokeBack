package com.lopamoko.smoke.product.vape.accessory.driptip;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DripTipService {
    Mono<DripTip> create(DripTip dripTip);
    Mono<DripTip> get(String dripTipId);
    Flux<DripTip> getAll();
    Mono<DripTip> update(DripTip dripTip);
    Mono<Void> remove(String dripTipId);
}
