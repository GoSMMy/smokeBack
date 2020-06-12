package com.lopamoko.smoke.product.vape.liquid;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiquidRepository extends ReactiveMongoRepository<LiquidEntity, String> {
}
