package com.lopamoko.smoke.product.vape.atomizer;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtomizerRepository extends ReactiveMongoRepository<AtomizerEntity, String> {
}
