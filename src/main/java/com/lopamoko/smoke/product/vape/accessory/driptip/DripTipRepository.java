package com.lopamoko.smoke.product.vape.accessory.driptip;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DripTipRepository extends ReactiveMongoRepository<DripTipEntity, String> {
}
