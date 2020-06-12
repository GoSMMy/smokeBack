package com.lopamoko.smoke.product.hookahs.tabacco;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class TabaccoToTabaccoEntityConverter implements Converter<Tabacco, TabaccoEntity> {
    @Override
    @NonNull
    public TabaccoEntity convert(Tabacco tabacco) {
        return new TabaccoEntity()
                .setTabaccoId(tabacco.getTabaccoId())
                .setTabaccoManufacturer(tabacco.getTabaccoManufacturer())
                .setTabaccoManufacturerCountry(tabacco.getTabaccoManufacturerCountry())
                .setTabaccoName(tabacco.getTabaccoName())
                .setTabaccoToasts(tabacco.getTabaccoToasts())
                .setTabaccoResistance(tabacco.getTabaccoResistance())
                .setTabaccoStrength(tabacco.getTabaccoStrength())
                .setTabaccoImg(tabacco.getTabaccoImg())
                .setTabaccoAmount(tabacco.getTabaccoAmount())
                .setTabaccoWeight(tabacco.getTabaccoWeight())
                .setTabaccoPrice(tabacco.getTabaccoPrice());
    }
}
