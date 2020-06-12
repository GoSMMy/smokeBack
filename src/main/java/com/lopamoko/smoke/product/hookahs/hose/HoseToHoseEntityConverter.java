package com.lopamoko.smoke.product.hookahs.hose;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class HoseToHoseEntityConverter implements Converter<Hose, HoseEntity> {
    @Override
    @NonNull
    public HoseEntity convert(Hose hose) {
        return new HoseEntity()
                .setHoseId(hose.getHoseId())
                .setHoseManufacturer(hose.getHoseManufacturer())
                .setHoseManufacturerCountry(hose.getHoseManufacturerCountry())
                .setHoseName(hose.getHoseName())
                .setHoseWidth(hose.getHoseWidth())
                .setHoseAmount(hose.getHoseAmount())
                .setHoseColor(hose.getHoseColor())
                .setHoseMaterial(hose.getHoseMaterial())
                .setHoseImg(hose.getHoseImg())
                .setHosePrice(hose.getHosePrice());
    }
}
