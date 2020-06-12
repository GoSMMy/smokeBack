package com.lopamoko.smoke.product.vape.mechanical;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class MechanicalEntityToMechanicalConverter implements Converter<MechanicalEntity, Mechanical> {
    @Override
    @NonNull
    public Mechanical convert(MechanicalEntity mechanicalEntity) {
        return new Mechanical()
                .setMechanicalId(mechanicalEntity.getMechanicalId())
                .setMechanicalManufacturer(mechanicalEntity.getMechanicalManufacturer())
                .setMechanicalManufacturerCountry(mechanicalEntity.getMechanicalManufacturerCountry())
                .setMechanicalName(mechanicalEntity.getMechanicalName())
                .setMechanicalImg(mechanicalEntity.getMechanicalImg())
                .setMechanicalAmount(mechanicalEntity.getMechanicalAmount())
                .setMechanicalConnector(mechanicalEntity.getMechanicalConnector())
                .setMechanicalConnectorType(mechanicalEntity.getMechanicalConnectorType())
                .setMechanicalEquipment(mechanicalEntity.getMechanicalEquipment())
                .setMechanicalHeight(mechanicalEntity.getMechanicalHeight())
                .setMechanicalWidth(mechanicalEntity.getMechanicalWidth())
                .setMechanicalWeight(mechanicalEntity.getMechanicalWeight())
                .setMechanicalPrice(mechanicalEntity.getMechanicalPrice());
    }
}
