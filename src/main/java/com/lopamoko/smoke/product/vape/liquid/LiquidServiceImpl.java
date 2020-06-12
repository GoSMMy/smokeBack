package com.lopamoko.smoke.product.vape.liquid;

import com.lopamoko.smoke.share.ApplicationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class LiquidServiceImpl implements LiquidService {
    private final LiquidRepository liquidRepository;
    private final LiquidEntityToLiquidConverter liquidEntityToLiquidConverter;
    private final LiquidToLiquidEntityConverter liquidToLiquidEntityConverter;

    @Override
    public Flux<Liquid> findAll(LiquidRequest liquidRequest) {
//        return liquidRepository.findAll()
//                .skip(liquidRequest.getSkip())
//                .limitRequest(liquidRequest.getLimit())
//                .map(liquidEntityToLiquidConverter::convert)
//                .log();
        return liquidRepository.findAll()
                .map(liquidEntityToLiquidConverter::convert);
    }

    @Override
    public Mono<Liquid> findById(String id) {
        return liquidRepository.findById(id)
                .switchIfEmpty(Mono.error(new LiquidNotFoundException(id)))
                .map(liquidEntityToLiquidConverter::convert);
    }

    @Override
    public Mono<Liquid> create(Liquid liquid) {
        return liquidRepository.save(liquidToLiquidEntityConverter.convert(liquid))
                .onErrorMap((throwable) -> new ApplicationException("Can't create rubber :( ", throwable))
                .map(liquidEntityToLiquidConverter::convert);
    }

    @Override
    public Mono<Void> remove(String id) {
        return liquidRepository.deleteById(id);
    }

    @Override
    public Mono<Liquid> update(String liquidId, Liquid liquid) {
        return liquidRepository.findById(liquidId)
                .switchIfEmpty(Mono.error(new LiquidNotFoundException(liquidId)))
                .map(liquidEntity -> liquidToLiquidEntityConverter.convert(liquid))
                .doOnSuccess(liquidRepository::save)
                .map(liquidEntityToLiquidConverter::convert);
    }
}
