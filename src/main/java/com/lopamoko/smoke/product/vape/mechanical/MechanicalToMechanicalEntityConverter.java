package com.lopamoko.smoke.product.vape.mechanical;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class MechanicalToMechanicalEntityConverter implements Converter<Mechanical, MechanicalEntity> {
    @Override
    @NonNull
    public MechanicalEntity convert(Mechanical mechanical) {
        return new MechanicalEntity()
                .setMechanicalId(mechanical.getMechanicalId())
                .setMechanicalManufacturer(mechanical.getMechanicalManufacturer())
                .setMechanicalManufacturerCountry(mechanical.getMechanicalManufacturerCountry())
                .setMechanicalName(mechanical.getMechanicalName())
                .setMechanicalAmount(mechanical.getMechanicalAmount())
                .setMechanicalConnector(mechanical.getMechanicalConnector())
                .setMechanicalConnectorType(mechanical.getMechanicalConnectorType())
                .setMechanicalImg(mechanical.getMechanicalImg())
                .setMechanicalEquipment(mechanical.getMechanicalEquipment())
                .setMechanicalHeight(mechanical.getMechanicalHeight())
                .setMechanicalWidth(mechanical.getMechanicalWidth())
                .setMechanicalWeight(mechanical.getMechanicalWeight())
                .setMechanicalPrice(mechanical.getMechanicalPrice());
    }
}
