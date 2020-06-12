package com.lopamoko.smoke.product.hookahs.flask;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class FlaskEntityToFlakConverter implements Converter<FlaskEntity, Flask> {
    @Override
    @NonNull
    public Flask convert(FlaskEntity flaskEntity) {
        return new Flask()
                .setFlaskId(flaskEntity.getFlaskId())
                .setFlaskManufacturer(flaskEntity.getFlaskManufacturer())
                .setFlaskManufacturerCountry(flaskEntity.getFlaskManufacturerCountry())
                .setFlaskName(flaskEntity.getFlaskName())
                .setFlaskHeight(flaskEntity.getFlaskHeight())
                .setFlaskDiameter(flaskEntity.getFlaskDiameter())
                .setFlaskAmount(flaskEntity.getFlaskAmount())
                .setFlaskColor(flaskEntity.getFlaskColor())
                .setFlaskMaterial(flaskEntity.getFlaskMaterial())
                .setFlaskImg(flaskEntity.getFlaskImg())
                .setFlaskPrice(flaskEntity.getFlaskPrice());
    }
}
