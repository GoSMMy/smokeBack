package com.lopamoko.smoke.product.hookahs.saucer;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaucerRepository extends ReactiveMongoRepository<SaucerEntity, String> {
}
