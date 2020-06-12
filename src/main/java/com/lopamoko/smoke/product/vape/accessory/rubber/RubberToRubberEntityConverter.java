package com.lopamoko.smoke.product.vape.accessory.rubber;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class RubberToRubberEntityConverter implements Converter<Rubber, RubberEntity> {
    @Override
    @NonNull
    public RubberEntity convert(Rubber rubber) {
        return (RubberEntity) new RubberEntity()
                .setColor(rubber.getColor())
                .setId(rubber.getId())
                .setManufacturer(rubber.getManufacturer())
                .setManufacturerCountry(rubber.getManufacturerCountry())
                .setName(rubber.getName())
                .setAmount(rubber.getAmount())
                .setImages(rubber.getImages())
                .setPrice(rubber.getPrice());
    }
}
