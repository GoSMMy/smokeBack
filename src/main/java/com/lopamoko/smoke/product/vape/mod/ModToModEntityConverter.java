package com.lopamoko.smoke.product.vape.mod;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModToModEntityConverter implements Converter<Mod, ModEntity> {

    @Override
    @NonNull
    public ModEntity convert(Mod mod) {
        return new ModEntity()
                .setBatteriesCnt(mod.getBatteriesCnt())
                .setBatteriesType(mod.getBatteriesType())
                .setId(mod.getId())
                .setManufacturer(mod.getManufacturer())
                .setName(mod.getName())
                .setShortFacts(mod.getShortFacts());
    }

    public List<ModEntity> convertAll(List<Mod> mods) {
        return mods.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
