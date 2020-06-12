package com.lopamoko.smoke.product.vape.component.flavor;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlavorRepository extends ReactiveMongoRepository<FlavorEntity, String> {
}
