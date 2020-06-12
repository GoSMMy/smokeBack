package com.lopamoko.smoke.product.hookahs.tabacco;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class TabaccoServiceImpl implements TabaccoService {
    private final TabaccoRepository tabaccoRepository;
    private final TabaccoToTabaccoEntityConverter tabaccoToTabaccoEntityConverter;
    private final TabaccoEntityToTabaccoConverter tabaccoEntityToTabaccoConverter;

    @Override
    public Mono<Tabacco> create(Tabacco tabacco) {
        return Mono.just(tabacco)
                .map(tabaccoToTabaccoEntityConverter::convert)
                .doOnSuccess(tabaccoRepository::save)
                .map(tabaccoEntityToTabaccoConverter::convert);
    }

    @Override
    public Mono<Tabacco> get(String tabaccoId) {
        return tabaccoRepository.findById(tabaccoId)
                .map(tabaccoEntityToTabaccoConverter::convert);
    }

    @Override
    public Flux<Tabacco> getAll() {
        return tabaccoRepository.findAll()
                .map(tabaccoEntityToTabaccoConverter::convert);
    }

    @Override
    public Mono<Tabacco> update(Tabacco tabacco) {
        return Mono.just(tabacco)
                .map(tabaccoToTabaccoEntityConverter::convert)
                .doOnSuccess(tabaccoRepository::save)
                .map(tabaccoEntityToTabaccoConverter::convert);
    }

    @Override
    public Mono<Void> remove(String tabaccoId) {
        return tabaccoRepository.deleteById(tabaccoId);
    }
}
