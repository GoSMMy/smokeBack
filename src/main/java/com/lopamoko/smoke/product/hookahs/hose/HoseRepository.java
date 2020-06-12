package com.lopamoko.smoke.product.hookahs.hose;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoseRepository extends ReactiveMongoRepository<HoseEntity, String> {
}
