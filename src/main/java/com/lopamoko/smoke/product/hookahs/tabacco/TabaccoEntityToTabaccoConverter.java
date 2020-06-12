package com.lopamoko.smoke.product.hookahs.tabacco;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class TabaccoEntityToTabaccoConverter implements Converter<TabaccoEntity, Tabacco> {
    @Override
    @NonNull
    public Tabacco convert(TabaccoEntity tabaccoEntity) {
        return new Tabacco()
                .setTabaccoId(tabaccoEntity.getTabaccoId())
                .setTabaccoManufacturer(tabaccoEntity.getTabaccoManufacturer())
                .setTabaccoManufacturerCountry(tabaccoEntity.getTabaccoManufacturerCountry())
                .setTabaccoName(tabaccoEntity.getTabaccoName())
                .setTabaccoToasts(tabaccoEntity.getTabaccoToasts())
                .setTabaccoResistance(tabaccoEntity.getTabaccoResistance())
                .setTabaccoStrength(tabaccoEntity.getTabaccoStrength())
                .setTabaccoImg(tabaccoEntity.getTabaccoImg())
                .setTabaccoAmount(tabaccoEntity.getTabaccoAmount())
                .setTabaccoWeight(tabaccoEntity.getTabaccoWeight())
                .setTabaccoPrice(tabaccoEntity.getTabaccoPrice());
    }
}
