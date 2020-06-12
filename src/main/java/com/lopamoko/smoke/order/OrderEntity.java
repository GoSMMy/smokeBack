package com.lopamoko.smoke.order;


import com.lopamoko.smoke.product.vape.liquid.LiquidEntity;
import com.lopamoko.smoke.user.UserEntity;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "orders")
public class OrderEntity {
    @Id
    private String orderId;
    private List<LiquidEntity> liquids;
    private UserEntity user;
    private OrderStatus orderStatus;
    private LocalDateTime orderDate;
}
