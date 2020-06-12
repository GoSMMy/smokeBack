package com.lopamoko.smoke.product.vape.accessory.driptip;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class DripTipServiceImpl implements DripTipService {
    private final DripTipRepository dripTipRepository;
    private final DripTipToDripTipEntityConverter dripTipToDripTipEntityConverter;
    private final DripTipEntityToDripTipConverter dripTipEntityToDripTipConverter;

    @Override
    public Mono<DripTip> create(DripTip dripTip) {
        return Mono.just(dripTip)
                .map(dripTipToDripTipEntityConverter::convert)
                .doOnSuccess(dripTipRepository::save)
                .map(dripTipEntityToDripTipConverter::convert);
    }

    @Override
    public Mono<DripTip> get(String dripTipId) {
        return dripTipRepository.findById(dripTipId)
                .map(dripTipEntityToDripTipConverter::convert);
    }

    @Override
    public Flux<DripTip> getAll() {
        return dripTipRepository.findAll()
                .map(dripTipEntityToDripTipConverter::convert);
    }

    @Override
    public Mono<DripTip> update(DripTip dripTip) {
        return Mono.just(dripTip)
                .map(dripTipToDripTipEntityConverter::convert)
                .doOnSuccess(dripTipRepository::save)
                .map(dripTipEntityToDripTipConverter::convert);
    }

    @Override
    public Mono<Void> remove(String dripTipId) {
        return dripTipRepository.deleteById(dripTipId);
    }
}
