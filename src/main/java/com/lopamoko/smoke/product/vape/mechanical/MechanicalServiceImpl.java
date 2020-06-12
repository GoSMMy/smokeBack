package com.lopamoko.smoke.product.vape.mechanical;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class MechanicalServiceImpl implements MechanicalService {
    private final MechanicalRepository mechanicalRepository;
    private final MechanicalEntityToMechanicalConverter mechanicalEntityToMechanicalConverter;
    private final MechanicalToMechanicalEntityConverter mechanicalToMechanicalEntityConverter;

    @Override
    public Mono<Mechanical> create(Mechanical mechanical) {
        return Mono.just(mechanical)
                .map(mechanicalToMechanicalEntityConverter::convert)
                .doOnSuccess(mechanicalRepository::save)
                .map(mechanicalEntityToMechanicalConverter::convert);
    }

    @Override
    public Mono<Mechanical> get(String mechanicalId) {
        return mechanicalRepository.findById(mechanicalId)
                .map(mechanicalEntityToMechanicalConverter::convert);
    }

    @Override
    public Flux<Mechanical> getAll() {
        return mechanicalRepository.findAll()
                .map(mechanicalEntityToMechanicalConverter::convert);
    }

    @Override
    public Mono<Mechanical> update(Mechanical mechanical) {
        return Mono.just(mechanical)
                .map(mechanicalToMechanicalEntityConverter::convert)
                .doOnSuccess(mechanicalRepository::save)
                .map(mechanicalEntityToMechanicalConverter::convert);
    }

    @Override
    public Mono<Void> remove(String mechanicalId) {
        return mechanicalRepository.deleteById(mechanicalId);
    }
}
