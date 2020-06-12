package com.lopamoko.smoke.product.vape.mod;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModEntityToModConverter implements Converter<ModEntity, Mod> {
    @Override
    @NonNull
    public Mod convert(ModEntity modEntity) {
        return new Mod()
                .setBatteriesCnt(modEntity.getBatteriesCnt())
                .setBatteriesType(modEntity.getBatteriesType())
                .setId(modEntity.getId())
                .setManufacturer(modEntity.getManufacturer())
                .setName(modEntity.getName())
                .setShortFacts(modEntity.getShortFacts());
    }

    public List<Mod> convertAll(List<ModEntity> modEntities) {
        return modEntities.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
