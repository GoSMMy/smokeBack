package com.lopamoko.smoke.order;

import com.lopamoko.smoke.product.vape.liquid.LiquidToLiquidEntityConverter;
import com.lopamoko.smoke.user.UserToUserEntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderToOrderEntityConverter implements Converter<Order, OrderEntity> {
    private final LiquidToLiquidEntityConverter liquidToLiquidEntityConverter;
    private final UserToUserEntityConverter userToUserEntityConverter;

    @Override
    @NonNull
    public OrderEntity convert(Order order) {
        return new OrderEntity()
                .setLiquids(liquidToLiquidEntityConverter.convertAll(order.getLiquids()))
                .setOrderDate(order.getOrderDate())
                .setOrderStatus(order.getOrderStatus())
                .setUser(userToUserEntityConverter.convert(order.getUser()));
    }
}
