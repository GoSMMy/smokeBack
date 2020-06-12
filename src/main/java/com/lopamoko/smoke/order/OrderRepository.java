package com.lopamoko.smoke.order;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface OrderRepository extends ReactiveMongoRepository<OrderEntity, String> {
    Flux<OrderEntity> findAllByUserUserId(String userId);
}
