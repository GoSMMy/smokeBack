package com.lopamoko.smoke.product.hookahs.valve;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValveRepository extends ReactiveMongoRepository<ValveEntity, String> {
}
