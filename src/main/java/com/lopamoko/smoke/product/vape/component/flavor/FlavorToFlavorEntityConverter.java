package com.lopamoko.smoke.product.vape.component.flavor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class FlavorToFlavorEntityConverter implements Converter<Flavor, FlavorEntity> {
    @Override
    @NonNull
    public FlavorEntity convert(Flavor flavor) {
        return new FlavorEntity()
                .setFlavorId(flavor.getFlavorId())
                .setFlavorManufacturer(flavor.getFlavorManufacturer())
                .setFlavorManufacturerCountry(flavor.getFlavorManufacturerCountry())
                .setFlavorName(flavor.getFlavorName())
                .setFlavorToast(flavor.getFlavorToast())
                .setFlavorAmount(flavor.getFlavorAmount())
                .setFlavorNicotine(flavor.getFlavorNicotine())
                .setFlavorVolume(flavor.getFlavorVolume())
                .setFlavorImg(flavor.getFlavorImg())
                .setFlavorPrice(flavor.getFlavorPrice());
    }
}
