package com.lopamoko.smoke.product.hookahs.body;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyRepository extends ReactiveMongoRepository<BodyEntity, String> {
}
