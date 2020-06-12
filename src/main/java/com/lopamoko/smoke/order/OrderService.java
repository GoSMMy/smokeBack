package com.lopamoko.smoke.order;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<Order> create(Order order);
    Flux<Order> getAllOrders(String userId);
    Mono<Order> update(Order order);
    Mono<Void> remove(String orderId);
    Mono<Order> get(String orderId);
}
