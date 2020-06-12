package com.lopamoko.smoke.product.vape.component.propylene;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropyleneRepository extends ReactiveMongoRepository<PropyleneEntity, String> {
}
