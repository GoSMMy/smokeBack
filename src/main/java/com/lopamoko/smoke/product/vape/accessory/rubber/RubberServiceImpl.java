package com.lopamoko.smoke.product.vape.accessory.rubber;

import com.lopamoko.smoke.share.ApplicationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class RubberServiceImpl implements RubberService {
    private final RubberRepository rubberRepository;
    private final RubberToRubberEntityConverter rubberToRubberEntityConverter;
    private final RubberEntityToRubberConverter rubberEntityToRubberConverter;

    @Override
    public Mono<Rubber> create(Rubber rubber) {
        return rubberRepository.save(rubberToRubberEntityConverter.convert(rubber))
                .onErrorMap((throwable) -> new ApplicationException("Can't create rubber :( ", throwable))
                .map(rubberEntityToRubberConverter::convert);
    }

    @Override
    public Mono<Rubber> get(String rubberId) {
        return rubberRepository.findById(rubberId)
                .map(rubberEntityToRubberConverter::convert);
    }

    @Override
    public Flux<Rubber> getAll() {
        return rubberRepository.findAll()
                .map(rubberEntityToRubberConverter::convert);
    }

    @Override
    public Mono<Rubber> update(Rubber rubber) {
        return rubberRepository.save(rubberToRubberEntityConverter.convert(rubber))
                .onErrorMap((throwable) -> new ApplicationException("Can't update rubber :( ", throwable))
                .map(rubberEntityToRubberConverter::convert);
    }

    @Override
    public Mono<Void> remove(String rubberId) {
        return rubberRepository.deleteById(rubberId);
    }
}
