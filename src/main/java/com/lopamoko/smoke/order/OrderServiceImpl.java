package com.lopamoko.smoke.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderEntityToOrderConverter orderEntityToOrderConverter;
    private final OrderToOrderEntityConverter orderToOrderEntityConverter;

    @Override
    public Mono<Order> create(Order order) {
        return Mono.just(order)
                .map(orderToOrderEntityConverter::convert)
                .doOnSuccess(orderRepository::save)
                .map(orderEntityToOrderConverter::convert);
    }

    @Override
    public Flux<Order> getAllOrders(String userId) {
        return orderRepository.findAllByUserUserId(userId)
                .map(orderEntityToOrderConverter::convert);
    }

    @Override
    public Mono<Order> update(Order order) {
        return Mono.just(order)
                .map(orderToOrderEntityConverter::convert)
                .doOnSuccess(orderRepository::save)
                .map(orderEntityToOrderConverter::convert);
    }

    @Override
    public Mono<Void> remove(String orderId) {
        return orderRepository.deleteById(orderId);
    }

    @Override
    public Mono<Order> get(String orderId) {
        return orderRepository.findById(orderId)
                .map(orderEntityToOrderConverter::convert);
    }
}
