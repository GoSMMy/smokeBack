package com.lopamoko.smoke.product.vape.accessory.rubber;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class RubberEntityToRubberConverter implements Converter<RubberEntity, Rubber> {
    @Override
    @NonNull
    public Rubber convert(RubberEntity rubberEntity) {
        return (Rubber) new Rubber()
                .setColor(rubberEntity.getColor())
                .setId(rubberEntity.getId())
                .setManufacturer(rubberEntity.getManufacturer())
                .setManufacturerCountry(rubberEntity.getManufacturerCountry())
                .setName(rubberEntity.getName())
                .setAmount(rubberEntity.getAmount())
                .setImages(rubberEntity.getImages())
                .setPrice(rubberEntity.getPrice());
    }
}
