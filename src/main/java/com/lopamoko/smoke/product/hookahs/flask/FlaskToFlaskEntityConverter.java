package com.lopamoko.smoke.product.hookahs.flask;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class FlaskToFlaskEntityConverter implements Converter<Flask, FlaskEntity> {
    @Override
    @NonNull
    public FlaskEntity convert(Flask flask) {
        return new FlaskEntity()
                .setFlaskId(flask.getFlaskId())
                .setFlaskManufacturer(flask.getFlaskManufacturer())
                .setFlaskManufacturerCountry(flask.getFlaskManufacturerCountry())
                .setFlaskName(flask.getFlaskName())
                .setFlaskHeight(flask.getFlaskHeight())
                .setFlaskDiameter(flask.getFlaskDiameter())
                .setFlaskAmount(flask.getFlaskAmount())
                .setFlaskColor(flask.getFlaskColor())
                .setFlaskMaterial(flask.getFlaskMaterial())
                .setFlaskImg(flask.getFlaskImg())
                .setFlaskPrice(flask.getFlaskPrice());
    }
}
