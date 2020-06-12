package com.lopamoko.smoke.product.vape.accessory.driptip;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class DripTipToDripTipEntityConverter implements Converter<DripTip, DripTipEntity> {
    @Override
    @NonNull
    public DripTipEntity convert(DripTip dripTip) {
        return new DripTipEntity()
                .setDripTipId(dripTip.getDripTipId())
                .setDripTipManufacturer(dripTip.getDripTipManufacturer())
                .setDripTipManufacturerCountry(dripTip.getDripTipManufacturerCountry())
                .setDripTipName(dripTip.getDripTipName())
                .setDripTipAmount(dripTip.getDripTipAmount())
                .setDripTipImg(dripTip.getDripTipImg())
                .setDripTipMaterial(dripTip.getDripTipMaterial())
                .setDripTipColor(dripTip.getDripTipColor())
                .setDripTipPrice(dripTip.getDripTipPrice());
    }
}
