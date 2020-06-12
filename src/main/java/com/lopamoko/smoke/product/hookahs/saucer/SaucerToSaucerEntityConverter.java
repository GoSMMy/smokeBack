package com.lopamoko.smoke.product.hookahs.saucer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class SaucerToSaucerEntityConverter implements Converter<Saucer, SaucerEntity> {
    @Override
    @NonNull
    public SaucerEntity convert(Saucer saucer) {
        return new SaucerEntity()
                .setSaucerId(saucer.getSaucerId())
                .setSaucerManufacturer(saucer.getSaucerManufacturer())
                .setSaucerManufacturerCountry(saucer.getSaucerManufacturerCountry())
                .setSaucerName(saucer.getSaucerName())
                .setSaucerWidth(saucer.getSaucerWidth())
                .setSaucerDiameter(saucer.getSaucerDiameter())
                .setSaucerAmount(saucer.getSaucerAmount())
                .setSaucerImg(saucer.getSaucerImg())
                .setSaucerMaterial(saucer.getSaucerMaterial())
                .setSaucerColor(saucer.getSaucerColor())
                .setSaucerPrice(saucer.getSaucerPrice());
    }
}
