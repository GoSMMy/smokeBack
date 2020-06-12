package com.lopamoko.smoke.product.hookahs.flask;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlaskRepository extends ReactiveMongoRepository<FlaskEntity, String> {
}
