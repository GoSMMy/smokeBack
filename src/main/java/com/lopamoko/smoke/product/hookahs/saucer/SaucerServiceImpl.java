package com.lopamoko.smoke.product.hookahs.saucer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class SaucerServiceImpl implements SaucerService{
    private final SaucerRepository saucerRepository;
    private final SaucerEntityToSaucerConverter saucerEntityToSaucerConverter;
    private final SaucerToSaucerEntityConverter saucerToSaucerEntityConverter;

    @Override
    public Mono<Saucer> create(Saucer saucer) {
        return Mono.just(saucer)
                .map(saucerToSaucerEntityConverter::convert)
                .doOnSuccess(saucerRepository::save)
                .map(saucerEntityToSaucerConverter::convert);
    }

    @Override
    public Mono<Saucer> get(String saucerId) {
        return saucerRepository.findById(saucerId)
                .map(saucerEntityToSaucerConverter::convert);
    }

    @Override
    public Flux<Saucer> getAll() {
        return saucerRepository.findAll()
                .map(saucerEntityToSaucerConverter::convert);
    }

    @Override
    public Mono<Saucer> update(Saucer saucer) {
        return Mono.just(saucer)
                .map(saucerToSaucerEntityConverter::convert)
                .doOnSuccess(saucerRepository::save)
                .map(saucerEntityToSaucerConverter::convert);
    }

    @Override
    public Mono<Void> remove(String saucerId) {
        return saucerRepository.deleteById(saucerId);
    }
}
