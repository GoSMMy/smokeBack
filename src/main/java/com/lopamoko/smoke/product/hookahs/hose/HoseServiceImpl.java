package com.lopamoko.smoke.product.hookahs.hose;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class HoseServiceImpl implements HoseService {
    private final HoseRepository hoseRepository;
    private final HoseToHoseEntityConverter hoseToHoseEntityConverter;
    private final HoseEntityToHoseConverter hoseEntityToHoseConverter;

    @Override
    public Mono<Hose> create(Hose hose) {
        return Mono.just(hose)
                .map(hoseToHoseEntityConverter::convert)
                .doOnSuccess(hoseRepository::save)
                .map(hoseEntityToHoseConverter::convert);
    }

    @Override
    public Mono<Hose> get(String hoseId) {
        return hoseRepository.findById(hoseId)
                .map(hoseEntityToHoseConverter::convert);
    }

    @Override
    public Flux<Hose> getAll() {
        return hoseRepository.findAll()
                .map(hoseEntityToHoseConverter::convert);
    }

    @Override
    public Mono<Hose> update(Hose hose) {
        return Mono.just(hose)
                .map(hoseToHoseEntityConverter::convert)
                .doOnSuccess(hoseRepository::save)
                .map(hoseEntityToHoseConverter::convert);
    }

    @Override
    public Mono<Void> remove(String hoseId) {
        return hoseRepository.deleteById(hoseId);
    }
}
