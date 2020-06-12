package com.lopamoko.smoke.product.hookahs.mouthpiece;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class MouthpieceServiceImpl implements  MouthpieceService {
    private final MouthpieceRepository mouthpieceRepository;
    private final MouthpieceEntityToMouthpieceConverter mouthpieceEntityToMouthpieceConverter;
    private final MouthpieceToMouthpieceEntityConverter mouthpieceToMouthpieceEntityConverter;

    @Override
    public Mono<Mouthpiece> create(Mouthpiece mouthpiece) {
        return Mono.just(mouthpiece)
                .map(mouthpieceToMouthpieceEntityConverter::convert)
                .doOnSuccess(mouthpieceRepository::save)
                .map(mouthpieceEntityToMouthpieceConverter::convert);
    }

    @Override
    public Mono<Mouthpiece> get(String mouthpieceId) {
        return mouthpieceRepository.findById(mouthpieceId)
                .map(mouthpieceEntityToMouthpieceConverter::convert);
    }

    @Override
    public Flux<Mouthpiece> getAll() {
        return mouthpieceRepository.findAll()
                .map(mouthpieceEntityToMouthpieceConverter::convert);
    }

    @Override
    public Mono<Mouthpiece> update(Mouthpiece mouthpiece) {
        return Mono.just(mouthpiece)
                .map(mouthpieceToMouthpieceEntityConverter::convert)
                .doOnSuccess(mouthpieceRepository::save)
                .map(mouthpieceEntityToMouthpieceConverter::convert);
    }

    @Override
    public Mono<Void> remove(String mouthpieceId) {
        return mouthpieceRepository.deleteById(mouthpieceId);
    }
}
