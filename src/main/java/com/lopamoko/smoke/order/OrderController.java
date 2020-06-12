package com.lopamoko.smoke.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/{id}")
    public Mono<Order> get(@PathVariable("id") String orderId) {
        return orderService.get(orderId);
    }

    @PostMapping
    public Mono<Order> create(@RequestBody Order order) {
        return orderService.create(order);
    }

    @PutMapping
    public Mono<Order> update(@RequestBody Order order) {
        return orderService.update(order);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String orderId) {
        return orderService.remove(orderId);
    }

    @GetMapping
    public Flux<Order> find(String userId) {
        return orderService.getAllOrders(userId);
    }
}
