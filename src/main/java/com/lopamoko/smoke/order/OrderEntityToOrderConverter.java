package com.lopamoko.smoke.order;

import com.lopamoko.smoke.product.vape.liquid.LiquidEntityToLiquidConverter;
import com.lopamoko.smoke.user.UserEntityToUserConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderEntityToOrderConverter implements Converter<OrderEntity, Order> {
    private final LiquidEntityToLiquidConverter liquidEntityToLiquidConverter;
    private final UserEntityToUserConverter userEntityToUserConverter;

    @Override
    @NonNull
    public Order convert(OrderEntity orderEntity) {
        return new Order()
                .setLiquids(liquidEntityToLiquidConverter.convertAll(orderEntity.getLiquids()))
                .setOrderDate(orderEntity.getOrderDate())
                .setOrderId(orderEntity.getOrderId())
                .setOrderStatus(orderEntity.getOrderStatus())
                .setUser(userEntityToUserConverter.convert(orderEntity.getUser()));
    }
}
