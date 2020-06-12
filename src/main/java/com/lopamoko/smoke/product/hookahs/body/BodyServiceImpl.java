package com.lopamoko.smoke.product.hookahs.body;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class BodyServiceImpl implements BodyService {
    private final BodyRepository bodyRepository;
    private final BodyEntityToBodyConverter bodyEntityToBodyConverter;
    private final BodyToBodyEntityConverter bodyToBodyEntityConverter;

    @Override
    public Mono<Body> create(Body body) {
        return Mono.just(body)
                .map(bodyToBodyEntityConverter::convert)
                .doOnSuccess(bodyRepository::save)
                .map(bodyEntityToBodyConverter::convert);
    }

    @Override
    public Mono<Body> get(String bodyId) {
        return bodyRepository.findById(bodyId)
                .map(bodyEntityToBodyConverter::convert);
    }

    @Override
    public Flux<Body> getAll() {
        return bodyRepository.findAll()
                .map(bodyEntityToBodyConverter::convert);
    }

    @Override
    public Mono<Body> update(Body body) {
        return Mono.just(body)
                .map(bodyToBodyEntityConverter::convert)
                .doOnSuccess(bodyRepository::save)
                .map(bodyEntityToBodyConverter::convert);
    }

    @Override
    public Mono<Void> remove(String bodyId) {
        return bodyRepository.deleteById(bodyId);
    }
}
