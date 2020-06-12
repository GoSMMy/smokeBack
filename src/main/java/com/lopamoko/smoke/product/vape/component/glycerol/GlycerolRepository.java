package com.lopamoko.smoke.product.vape.component.glycerol;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlycerolRepository extends ReactiveMongoRepository<GlycerolEntity, String> {
}
