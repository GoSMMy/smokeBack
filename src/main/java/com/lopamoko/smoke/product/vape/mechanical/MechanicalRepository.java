package com.lopamoko.smoke.product.vape.mechanical;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicalRepository extends ReactiveMongoRepository<MechanicalEntity, String> {
}
