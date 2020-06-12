package com.lopamoko.smoke.product.vape.component.flavor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class FlavorServiceImpl implements FlavorService {
    private final FlavorRepository flavorRepository;
    private final FlavorEntityToFlavorConverter flavorEntityToFlavorConverter;
    private final FlavorToFlavorEntityConverter flavorToFlavorEntityConverter;

    @Override
    public Mono<Flavor> create(Flavor flavor) {
        return Mono.just(flavor)
                .map(flavorToFlavorEntityConverter::convert)
                .doOnSuccess(flavorRepository::save)
                .map(flavorEntityToFlavorConverter::convert);
    }

    @Override
    public Mono<Flavor> get(String flavorId) {
        return flavorRepository.findById(flavorId)
                .map(flavorEntityToFlavorConverter::convert);
    }

    @Override
    public Flux<Flavor> getAll() {
        return flavorRepository.findAll()
                .map(flavorEntityToFlavorConverter::convert);
    }

    @Override
    public Mono<Flavor> update(Flavor flavor) {
        return Mono.just(flavor)
                .map(flavorToFlavorEntityConverter::convert)
                .doOnSuccess(flavorRepository::save)
                .map(flavorEntityToFlavorConverter::convert);
    }

    @Override
    public Mono<Void> remove(String flavorId) {
        return flavorRepository.deleteById(flavorId);
    }
}
