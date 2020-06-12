package com.lopamoko.smoke.product.vape.atomizer;

import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AtomizerToAtomizerEntityConverter implements Converter<Atomizer, AtomizerEntity> {

    @Override
    @NonNull
    public AtomizerEntity convert(Atomizer atomizer) {
        return new AtomizerEntity()
                .setBody(atomizer.getBody())
                .setCount(atomizer.getCount())
                .setId(atomizer.getId())
                .setPrice(atomizer.getPrice())
                .setResistance(atomizer.getResistance())
                .setShortFacts(atomizer.getShortFacts())
                .setWick(atomizer.getWick());
    }

    public List<AtomizerEntity> convertAll(List<Atomizer> atomizers) {
        return atomizers.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
