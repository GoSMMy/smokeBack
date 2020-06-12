package com.lopamoko.smoke.product.hookahs.cup;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class CupToCupEntityConverter implements Converter<Cup, CupEntity> {
    @Override
    @NonNull
    public CupEntity convert(Cup cup) {
        return new CupEntity()
                .setCupId(cup.getCupId())
                .setCupManufacturer(cup.getCupManufacturer())
                .setCupManufacturerCountry(cup.getCupManufacturerCountry())
                .setCupName(cup.getCupName())
                .setCupHeight(cup.getCupHeight())
                .setCupDiameter(cup.getCupDiameter())
                .setCupAmount(cup.getCupAmount())
                .setCupImg(cup.getCupImg())
                .setCupMaterial(cup.getCupMaterial())
                .setCupColor(cup.getCupColor())
                .setCupPrice(cup.getCupPrice());
    }
}
