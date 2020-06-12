package com.lopamoko.smoke.product.hookahs.saucer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class SaucerEntityToSaucerConverter implements Converter<SaucerEntity, Saucer> {
    @Override
    @NonNull
    public Saucer convert(SaucerEntity saucerEntity) {
        return new Saucer()
                .setSaucerId(saucerEntity.getSaucerId())
                .setSaucerManufacturer(saucerEntity.getSaucerManufacturer())
                .setSaucerManufacturerCountry(saucerEntity.getSaucerManufacturerCountry())
                .setSaucerName(saucerEntity.getSaucerName())
                .setSaucerWidth(saucerEntity.getSaucerWidth())
                .setSaucerDiameter(saucerEntity.getSaucerDiameter())
                .setSaucerAmount(saucerEntity.getSaucerAmount())
                .setSaucerImg(saucerEntity.getSaucerImg())
                .setSaucerColor(saucerEntity.getSaucerColor())
                .setSaucerMaterial(saucerEntity.getSaucerMaterial())
                .setSaucerPrice(saucerEntity.getSaucerPrice());
    }
}
