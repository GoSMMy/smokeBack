package com.lopamoko.smoke.recommendation;

import com.lopamoko.smoke.product.Product;
import com.lopamoko.smoke.user.User;
import com.lopamoko.smoke.user.UserRepository;
import com.lopamoko.smoke.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RecommendManager {
    private final UserService userService;
    private final double TRASH_HOLD = 1;
//
//    public double predictRating(User user, Product product) {
//        Flux<User> neighborhood = createNeighborhood(user);
//        double prediction = createPredictionFromNeighborhood(neighborhood, product);
//        return prediction;
//    }
//
//    private Flux<User> createNeighborhood(User user) {
//        userService.find()
//                .filter(otherUser -> !otherUser.getUserId().equals(user.getUserId()))
//                .map(otherUser -> calculateSimilarity(user, otherUser))
//                .filter(similarity -> similarity < TRASH_HOLD);
//    }
//
//    private double calculateSimilarity(User user, User otherUser) {
//        user.getRatings().parallelStream()
//                .
//    }
}
