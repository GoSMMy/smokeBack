package com.lopamoko.smoke.product.hookahs.flask;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class FlaskServiceImpl implements FlaskService {
    private final FlaskRepository flaskRepository;
    private final FlaskEntityToFlakConverter flaskEntityToFlakConverter;
    private final FlaskToFlaskEntityConverter flaskToFlaskEntityConverter;

    @Override
    public Mono<Flask> create(Flask flask) {
        return Mono.just(flask)
                .map(flaskToFlaskEntityConverter::convert)
                .doOnSuccess(flaskRepository::save)
                .map(flaskEntityToFlakConverter::convert);
    }

    @Override
    public Mono<Flask> get(String flaskId) {
        return flaskRepository.findById(flaskId)
                .map(flaskEntityToFlakConverter::convert);
    }

    @Override
    public Flux<Flask> getAll() {
        return flaskRepository.findAll()
                .map(flaskEntityToFlakConverter::convert);
    }

    @Override
    public Mono<Flask> update(Flask flask) {
        return Mono.just(flask)
                .map(flaskToFlaskEntityConverter::convert)
                .doOnSuccess(flaskRepository::save)
                .map(flaskEntityToFlakConverter::convert);
    }

    @Override
    public Mono<Void> remove(String flaskId) {
        return flaskRepository.deleteById(flaskId);
    }
}
