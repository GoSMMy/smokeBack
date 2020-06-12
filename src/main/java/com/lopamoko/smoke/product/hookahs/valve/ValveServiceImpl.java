package com.lopamoko.smoke.product.hookahs.valve;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class ValveServiceImpl implements ValveService {
    private final ValveRepository valveRepository;
    private final ValveToValveEntityConverter valveToValveEntityConverter;
    private final ValveEntityToValveConverter valveEntityToValveConverter;

    @Override
    public Mono<Valve> create(Valve valve) {
        return Mono.just(valve)
                .map(valveToValveEntityConverter::convert)
                .doOnSuccess(valveRepository::save)
                .map(valveEntityToValveConverter::convert);
    }

    @Override
    public Mono<Valve> get(String valveId) {
        return valveRepository.findById(valveId)
                .map(valveEntityToValveConverter::convert);
    }

    @Override
    public Flux<Valve> getAll() {
        return valveRepository.findAll()
                .map(valveEntityToValveConverter::convert);
    }

    @Override
    public Mono<Valve> update(Valve valve) {
        return Mono.just(valve)
                .map(valveToValveEntityConverter::convert)
                .doOnSuccess(valveRepository::save)
                .map(valveEntityToValveConverter::convert);
    }

    @Override
    public Mono<Void> remove(String valveId) {
        return valveRepository.deleteById(valveId);
    }
}
