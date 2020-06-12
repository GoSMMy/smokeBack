package com.lopamoko.smoke.product.hookahs.cup;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CupRepository extends ReactiveMongoRepository<CupEntity, String> {
}
