package com.lopamoko.smoke.product.hookahs.cup;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class CupEntityToCupConverter implements Converter<CupEntity, Cup> {
    @Override
    @NonNull
    public Cup convert(CupEntity cupEntity) {
        return new Cup()
                .setCupId(cupEntity.getCupId())
                .setCupManufacturer(cupEntity.getCupManufacturer())
                .setCupManufacturerCountry(cupEntity.getCupManufacturerCountry())
                .setCupName(cupEntity.getCupName())
                .setCupHeight(cupEntity.getCupHeight())
                .setCupDiameter(cupEntity.getCupDiameter())
                .setCupAmount(cupEntity.getCupAmount())
                .setCupImg(cupEntity.getCupImg())
                .setCupMaterial(cupEntity.getCupMaterial())
                .setCupColor(cupEntity.getCupColor())
                .setCupPrice(cupEntity.getCupPrice());
    }
}
