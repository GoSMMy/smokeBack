package com.lopamoko.smoke.product.hookahs.body;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class BodyToBodyEntityConverter implements Converter<Body, BodyEntity> {
    @Override
    @NonNull
    public BodyEntity convert(Body body) {
        return new BodyEntity()
                .setBodyId(body.getBodyId())
                .setBodyManufacturer(body.getBodyManufacturer())
                .setBodyManufacturerCountry(body.getBodyManufacturerCountry())
                .setBodyName(body.getBodyName())
                .setBodyHeight(body.getBodyHeight())
                .setBodyDiameter(body.getBodyDiameter())
                .setBodyAmount(body.getBodyAmount())
                .setBodyImg(body.getBodyImg())
                .setBodyColor(body.getBodyColor())
                .setBodyPrice(body.getBodyPrice());
    }
}
