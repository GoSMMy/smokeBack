package com.lopamoko.smoke.product.vape.component.propylene;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class PropyleneServiceImpl implements PropyleneService {
    private final PropyleneRepository propyleneRepository;
    private final PropyleneEntityToPropyleneConverter propyleneEntityToPropyleneConverter;
    private final PropyleneToPropyleneEntityConverter propyleneToPropyleneEntityConverter;

    @Override
    public Mono<Propylene> create(Propylene propylene) {
        return Mono.just(propylene)
                .map(propyleneToPropyleneEntityConverter::convert)
                .doOnSuccess(propyleneRepository::save)
                .map(propyleneEntityToPropyleneConverter::convert);
    }

    @Override
    public Mono<Propylene> get(String propyleneId) {
        return propyleneRepository.findById(propyleneId)
                .map(propyleneEntityToPropyleneConverter::convert);
    }

    @Override
    public Flux<Propylene> getAll() {
        return propyleneRepository.findAll()
                .map(propyleneEntityToPropyleneConverter::convert);
    }

    @Override
    public Mono<Propylene> update(Propylene propylene) {
        return Mono.just(propylene)
                .map(propyleneToPropyleneEntityConverter::convert)
                .doOnSuccess(propyleneRepository::save)
                .map(propyleneEntityToPropyleneConverter::convert);
    }

    @Override
    public Mono<Void> remove(String propyleneId) {
        return propyleneRepository.deleteById(propyleneId);
    }
}
