package com.lopamoko.smoke.product.vape.atomizer;

import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AtomizerEntityToAtomizerConverter implements Converter<AtomizerEntity, Atomizer> {

    @Override
    @NonNull
    public Atomizer convert(AtomizerEntity atomizerEntity) {
        return new Atomizer()
                .setBody(atomizerEntity.getBody())
                .setCount(atomizerEntity.getCount())
                .setId(atomizerEntity.getId())
                .setPrice(atomizerEntity.getPrice())
                .setResistance(atomizerEntity.getResistance())
                .setShortFacts(atomizerEntity.getShortFacts())
                .setWick(atomizerEntity.getWick());
    }

    public List<Atomizer> convertAll(List<AtomizerEntity> atomizerEntityList) {
        return atomizerEntityList.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
