package com.lopamoko.smoke.product.vape.mod;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ModServiceImpl implements ModService {
    private final ModRepository modRepository;
    private final ModToModEntityConverter modToModEntityConverter;
    private final ModEntityToModConverter modEntityToModConverter;

    @Override
    public Mono<Mod> create(Mod mod) {
        return Mono.just(mod)
                .map(modToModEntityConverter::convert)
                .doOnSuccess(modRepository::save)
                .map(modEntityToModConverter::convert);
    }

    @Override
    public Mono<Mod> update(Mod mod) {
        return Mono.just(mod)
                .map(modToModEntityConverter::convert)
                .doOnSuccess(modRepository::save)
                .map(modEntityToModConverter::convert);
    }

    @Override
    public Mono<Void> remove(String modId) {
        return modRepository.deleteById(modId);
    }

    @Override
    public Mono<Mod> get(String modId) {
        return modRepository.findById(modId)
                .map(modEntityToModConverter::convert);
    }

    @Override
    public Flux<Mod> find(ModRequest modRequest) {
        return modRepository.findAll()
                .skip(modRequest.getSkip())
                .limitRequest(modRequest.getLimit())
                .map(modEntityToModConverter::convert);
    }
}
