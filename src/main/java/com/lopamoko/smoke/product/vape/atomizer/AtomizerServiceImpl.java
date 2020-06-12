package com.lopamoko.smoke.product.vape.atomizer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class AtomizerServiceImpl implements AtomizerService {
    private final AtomizerRepository atomizerRepository;
    private final AtomizerToAtomizerEntityConverter atomizerToAtomizerEntityConverter;
    private final AtomizerEntityToAtomizerConverter atomizerEntityToAtomizerConverter;

    @Override
    public Mono<Atomizer> get(String atomizerId) {
        return atomizerRepository.findById(atomizerId)
                .map(atomizerEntityToAtomizerConverter::convert);
    }

    @Override
    public Mono<Atomizer> update(Atomizer atomizer) {
        return Mono.just(atomizer)
                .map(atomizerToAtomizerEntityConverter::convert)
                .doOnSuccess(atomizerRepository::save)
                .map(atomizerEntityToAtomizerConverter::convert);
    }

    @Override
    public Mono<Void> remove(String atomizerId) {
        return atomizerRepository.deleteById(atomizerId);
    }

    @Override
    public Flux<Atomizer> find(AtomizerRequest atomizerRequest) {
        return atomizerRepository.findAll()
                .skip(atomizerRequest.getSkip())
                .limitRequest(atomizerRequest.getLimit())
                .map(atomizerEntityToAtomizerConverter::convert);
    }

    @Override
    public Mono<Atomizer> create(Atomizer atomizer) {
        return Mono.just(atomizer)
                .map(atomizerToAtomizerEntityConverter::convert)
                .doOnSuccess(atomizerRepository::save)
                .map(atomizerEntityToAtomizerConverter::convert);
    }
}
