package com.lopamoko.smoke.product.hookahs.valve;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class ValveEntityToValveConverter implements Converter<ValveEntity, Valve> {
    @Override
    @NonNull
    public Valve convert(ValveEntity valveEntity) {
        return new Valve()
                .setValveId(valveEntity.getValveId())
                .setValveManufacturer(valveEntity.getValveManufacturer())
                .setValveManufacturerCountry(valveEntity.getValveManufacturerCountry())
                .setValveName(valveEntity.getValveName())
                .setValveColor(valveEntity.getValveColor())
                .setValveAmount(valveEntity.getValveAmount())
                .setValveImg(valveEntity.getValveImg())
                .setValveMaterial(valveEntity.getValveMaterial())
                .setValvePrice(valveEntity.getValvePrice());
    }
}
