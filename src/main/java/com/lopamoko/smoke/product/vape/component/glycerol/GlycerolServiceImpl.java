package com.lopamoko.smoke.product.vape.component.glycerol;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class GlycerolServiceImpl implements GlycerolService {
    private final GlycerolRepository glycerolRepository;
    private final GlycerolToGlycerolEntityConverter glycerolToGlycerolEntityConverter;
    private final GlycerolEntityToGlycerolConverter glycerolEntityToGlycerolConverter;

    @Override
    public Mono<Glycerol> create(Glycerol glycerol) {
        return Mono.just(glycerol)
                .map(glycerolToGlycerolEntityConverter::convert)
                .doOnSuccess(glycerolRepository::save)
                .map(glycerolEntityToGlycerolConverter::convert);
    }

    @Override
    public Mono<Glycerol> get(String glycerolId) {
        return glycerolRepository.findById(glycerolId)
                .map(glycerolEntityToGlycerolConverter::convert);
    }

    @Override
    public Flux<Glycerol> getAll() {
        return glycerolRepository.findAll()
                .map(glycerolEntityToGlycerolConverter::convert);
    }

    @Override
    public Mono<Glycerol> update(Glycerol glycerol) {
        return Mono.just(glycerol)
                .map(glycerolToGlycerolEntityConverter::convert)
                .doOnSuccess(glycerolRepository::save)
                .map(glycerolEntityToGlycerolConverter::convert);
    }

    @Override
    public Mono<Void> remove(String glycerolId) {
        return glycerolRepository.deleteById(glycerolId);
    }
}
