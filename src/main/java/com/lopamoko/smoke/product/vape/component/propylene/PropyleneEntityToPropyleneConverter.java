package com.lopamoko.smoke.product.vape.component.propylene;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class PropyleneEntityToPropyleneConverter implements Converter<PropyleneEntity, Propylene> {
    @Override
    @NonNull
    public Propylene convert(PropyleneEntity propyleneEntity) {
        return new Propylene()
                .setPropyleneId(propyleneEntity.getPropyleneId())
                .setPropyleneManufacturer(propyleneEntity.getPropyleneManufacturer())
                .setPropyleneManufacturerCountry(propyleneEntity.getPropyleneManufacturerCountry())
                .setPropyleneName(propyleneEntity.getPropyleneName())
                .setPropyleneVolume(propyleneEntity.getPropyleneVolume())
                .setPropyleneAmount(propyleneEntity.getPropyleneAmount())
                .setPropyleneImg(propyleneEntity.getPropyleneImg())
                .setPropylenePrice(propyleneEntity.getPropylenePrice());
    }
}
