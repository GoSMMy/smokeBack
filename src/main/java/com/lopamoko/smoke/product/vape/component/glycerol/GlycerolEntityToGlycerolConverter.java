package com.lopamoko.smoke.product.vape.component.glycerol;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class GlycerolEntityToGlycerolConverter implements Converter<GlycerolEntity, Glycerol> {
    @Override
    @NonNull
    public Glycerol convert(GlycerolEntity glycerolEntity) {
        return new Glycerol()
                .setGlycerolId(glycerolEntity.getGlycerolId())
                .setGlycerolManufacturer(glycerolEntity.getGlycerolManufacturer())
                .setGlycerolManufacturerCountry(glycerolEntity.getGlycerolManufacturerCountry())
                .setGlycerolName(glycerolEntity.getGlycerolName())
                .setGlycerolVolume(glycerolEntity.getGlycerolVolume())
                .setGlycerolAmount(glycerolEntity.getGlycerolAmount())
                .setGlycerolImg(glycerolEntity.getGlycerolImg())
                .setGlycerolPrice(glycerolEntity.getGlycerolPrice());
    }
}
