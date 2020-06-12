package com.lopamoko.smoke.product.hookahs.mouthpiece;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MouthpieceRepository extends ReactiveMongoRepository<MouthpieceEntity, String> {
}
