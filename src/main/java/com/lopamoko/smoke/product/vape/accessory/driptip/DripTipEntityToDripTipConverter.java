package com.lopamoko.smoke.product.vape.accessory.driptip;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class DripTipEntityToDripTipConverter implements Converter<DripTipEntity, DripTip> {
    @Override
    @NonNull
    public DripTip convert(DripTipEntity dripTipEntity) {
        return new DripTip()
                .setDripTipId(dripTipEntity.getDripTipId())
                .setDripTipManufacturer(dripTipEntity.getDripTipManufacturer())
                .setDripTipManufacturerCountry(dripTipEntity.getDripTipManufacturerCountry())
                .setDripTipName(dripTipEntity.getDripTipName())
                .setDripTipAmount(dripTipEntity.getDripTipAmount())
                .setDripTipImg(dripTipEntity.getDripTipImg())
                .setDripTipMaterial(dripTipEntity.getDripTipMaterial())
                .setDripTipColor(dripTipEntity.getDripTipColor())
                .setDripTipPrice(dripTipEntity.getDripTipPrice());
    }
}
