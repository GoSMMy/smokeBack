package com.lopamoko.smoke.product.hookahs.hose;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class HoseEntityToHoseConverter implements Converter<HoseEntity, Hose> {
    @Override
    @NonNull
    public Hose convert(HoseEntity hoseEntity) {
        return new Hose()
                .setHoseId(hoseEntity.getHoseId())
                .setHoseManufacturer(hoseEntity.getHoseManufacturer())
                .setHoseManufacturerCountry(hoseEntity.getHoseManufacturerCountry())
                .setHoseName(hoseEntity.getHoseName())
                .setHoseWidth(hoseEntity.getHoseWidth())
                .setHoseAmount(hoseEntity.getHoseAmount())
                .setHoseColor(hoseEntity.getHoseColor())
                .setHoseMaterial(hoseEntity.getHoseMaterial())
                .setHoseImg(hoseEntity.getHoseImg())
                .setHosePrice(hoseEntity.getHosePrice());
    }
}
