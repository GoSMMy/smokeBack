package com.lopamoko.smoke.product.vape.component.propylene;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class PropyleneToPropyleneEntityConverter implements Converter<Propylene, PropyleneEntity> {
    @Override
    @NonNull
    public PropyleneEntity convert(Propylene propylene) {
        return new PropyleneEntity()
                .setPropyleneId(propylene.getPropyleneId())
                .setPropyleneManufacturer(propylene.getPropyleneManufacturer())
                .setPropyleneManufacturerCountry(propylene.getPropyleneManufacturerCountry())
                .setPropyleneName(propylene.getPropyleneName())
                .setPropyleneVolume(propylene.getPropyleneVolume())
                .setPropyleneAmount(propylene.getPropyleneAmount())
                .setPropyleneImg(propylene.getPropyleneImg())
                .setPropylenePrice(propylene.getPropylenePrice());
    }
}
