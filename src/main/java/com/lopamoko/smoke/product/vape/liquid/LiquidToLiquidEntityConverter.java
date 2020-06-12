package com.lopamoko.smoke.product.vape.liquid;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LiquidToLiquidEntityConverter implements Converter<Liquid, LiquidEntity> {

    @Override
    @NonNull
    public LiquidEntity convert(Liquid liquid) {
        return (LiquidEntity) new LiquidEntity()
                .setShortFacts(liquid.getShortFacts())
                .setNicotine(liquid.getNicotine())
                .setProportions(liquid.getProportions())
                .setToasts(liquid.getToasts())
                .setVolume(liquid.getVolume())
                .setId(liquid.getId())
                .setManufacturer(liquid.getManufacturer())
                .setManufacturerCountry(liquid.getManufacturerCountry())
                .setName(liquid.getName())
                .setAmount(liquid.getAmount())
                .setImages(liquid.getImages())
                .setPrice(liquid.getPrice());
    }

    public List<LiquidEntity> convertAll(List<Liquid> liquids) {
        return liquids.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
