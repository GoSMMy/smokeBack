package com.lopamoko.smoke.product.vape.mod;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModRepository extends ReactiveMongoRepository<ModEntity, String> {
}
