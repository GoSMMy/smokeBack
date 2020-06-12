package com.lopamoko.smoke.order;

import com.lopamoko.smoke.product.vape.liquid.Liquid;
import com.lopamoko.smoke.user.User;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Accessors(chain = true)
public class Order {
    private String orderId;
    private List<Liquid> liquids;
    private User user;
    private OrderStatus orderStatus;
    private LocalDateTime orderDate;
}
