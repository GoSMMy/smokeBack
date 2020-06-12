package com.lopamoko.smoke.product.hookahs.cup;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class CupServiceImpl implements CupService{
    private final CupRepository cupRepository;
    private final CupEntityToCupConverter cupEntityToCupConverter;
    private final CupToCupEntityConverter cupToCupEntityConverter;

    @Override
    public Mono<Cup> create(Cup cup) {
        return Mono.just(cup)
                .map(cupToCupEntityConverter::convert)
                .doOnSuccess(cupRepository::save)
                .map(cupEntityToCupConverter::convert);
    }

    @Override
    public Mono<Cup> get(String cupId) {
        return cupRepository.findById(cupId)
                .map(cupEntityToCupConverter::convert);
    }

    @Override
    public Flux<Cup> getAll() {
        return cupRepository.findAll()
                .map(cupEntityToCupConverter::convert);
    }

    @Override
    public Mono<Cup> update(Cup cup) {
        return Mono.just(cup)
                .map(cupToCupEntityConverter::convert)
                .doOnSuccess(cupRepository::save)
                .map(cupEntityToCupConverter::convert);
    }

    @Override
    public Mono<Void> remove(String cupId) {
        return cupRepository.deleteById(cupId);
    }
}
