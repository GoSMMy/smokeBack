package com.lopamoko.smoke.product.vape.component.flavor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class FlavorEntityToFlavorConverter implements Converter<FlavorEntity, Flavor> {
    @Override
    @NonNull
    public Flavor convert(FlavorEntity flavorEntity) {
        return new Flavor()
                .setFlavorId(flavorEntity.getFlavorId())
                .setFlavorManufacturer(flavorEntity.getFlavorManufacturer())
                .setFlavorManufacturerCountry(flavorEntity.getFlavorManufacturerCountry())
                .setFlavorName(flavorEntity.getFlavorName())
                .setFlavorToast(flavorEntity.getFlavorToast())
                .setFlavorImg(flavorEntity.getFlavorImg())
                .setFlavorAmount(flavorEntity.getFlavorAmount())
                .setFlavorNicotine(flavorEntity.getFlavorNicotine())
                .setFlavorVolume(flavorEntity.getFlavorVolume())
                .setFlavorPrice(flavorEntity.getFlavorPrice());
    }
}
