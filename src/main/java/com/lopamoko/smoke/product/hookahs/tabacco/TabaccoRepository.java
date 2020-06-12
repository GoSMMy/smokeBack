package com.lopamoko.smoke.product.hookahs.tabacco;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabaccoRepository extends ReactiveMongoRepository<TabaccoEntity, String> {
}
