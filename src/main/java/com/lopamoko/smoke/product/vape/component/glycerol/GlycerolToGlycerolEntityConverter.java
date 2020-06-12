package com.lopamoko.smoke.product.vape.component.glycerol;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class GlycerolToGlycerolEntityConverter implements Converter<Glycerol, GlycerolEntity> {
    @Override
    @NonNull
    public GlycerolEntity convert(Glycerol glycerol) {
        return new GlycerolEntity()
                .setGlycerolId(glycerol.getGlycerolId())
                .setGlycerolManufacturer(glycerol.getGlycerolManufacturer())
                .setGlycerolManufacturerCountry(glycerol.getGlycerolManufacturerCountry())
                .setGlycerolName(glycerol.getGlycerolName())
                .setGlycerolVolume(glycerol.getGlycerolVolume())
                .setGlycerolAmount(glycerol.getGlycerolAmount())
                .setGlycerolImg(glycerol.getGlycerolImg())
                .setGlycerolPrice(glycerol.getGlycerolPrice());
    }
}
