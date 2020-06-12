package com.lopamoko.smoke.product.vape.accessory.rubber;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubberRepository extends ReactiveMongoRepository<RubberEntity, String> {
}
