package com.lopamoko.smoke.product.hookahs.valve;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class ValveToValveEntityConverter implements Converter<Valve, ValveEntity> {
    @Override
    @NonNull
    public ValveEntity convert(Valve valve) {
        return new ValveEntity()
                .setValveId(valve.getValveId())
                .setValveManufacturer(valve.getValveManufacturer())
                .setValveManufacturerCountry(valve.getValveManufacturerCountry())
                .setValveName(valve.getValveName())
                .setValveColor(valve.getValveColor())
                .setValveMaterial(valve.getValveMaterial())
                .setValveAmount(valve.getValveAmount())
                .setValveImg(valve.getValveImg())
                .setValvePrice(valve.getValvePrice());
    }
}
