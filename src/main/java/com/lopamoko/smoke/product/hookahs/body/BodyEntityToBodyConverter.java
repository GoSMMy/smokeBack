package com.lopamoko.smoke.product.hookahs.body;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class BodyEntityToBodyConverter implements Converter<BodyEntity, Body> {
    @Override
    @NonNull
    public Body convert(BodyEntity bodyEntity) {
        return new Body()
                .setBodyId(bodyEntity.getBodyId())
                .setBodyManufacturer(bodyEntity.getBodyManufacturer())
                .setBodyManufacturerCountry(bodyEntity.getBodyManufacturerCountry())
                .setBodyName(bodyEntity.getBodyName())
                .setBodyHeight(bodyEntity.getBodyHeight())
                .setBodyDiameter(bodyEntity.getBodyDiameter())
                .setBodyAmount(bodyEntity.getBodyAmount())
                .setBodyImg(bodyEntity.getBodyImg())
                .setBodyColor(bodyEntity.getBodyColor())
                .setBodyPrice(bodyEntity.getBodyPrice());
    }
}
