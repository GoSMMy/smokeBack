package com.lopamoko.smoke.product.vape.liquid;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LiquidEntityToLiquidConverter implements Converter<LiquidEntity, Liquid> {

    @Override
    @NonNull
    public Liquid convert(LiquidEntity liquidEntity) {
        return (Liquid) new Liquid()
                .setShortFacts(liquidEntity.getShortFacts())
                .setNicotine(liquidEntity.getNicotine())
                .setProportions(liquidEntity.getProportions())
                .setToasts(liquidEntity.getToasts())
                .setVolume(liquidEntity.getVolume())
                .setId(liquidEntity.getId())
                .setManufacturer(liquidEntity.getManufacturer())
                .setManufacturerCountry(liquidEntity.getManufacturerCountry())
                .setName(liquidEntity.getName())
                .setAmount(liquidEntity.getAmount())
                .setImages(liquidEntity.getImages())
                .setPrice(liquidEntity.getPrice());
    }

    public List<Liquid> convertAll(List<LiquidEntity> liquidEntityList) {
        return liquidEntityList.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
