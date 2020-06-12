package com.lopamoko.smoke.product.hookahs.body;

import com.lopamoko.smoke.product.hookahs.cup.Cup;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hookahs/body")
@RequiredArgsConstructor
public class BodyController {
    private final BodyService bodyService;

    @GetMapping("/{id}")
    public Mono<Body> get(@PathVariable("id") String bodyId) {
        return bodyService.get(bodyId);
    }

    @PostMapping
    public Mono<Body> create(@RequestBody Body body) {
        return bodyService.create(body);
    }

    @PutMapping
    public Mono<Body> update(@RequestBody Body body) {
        return bodyService.update(body);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String bodyId) {
        return bodyService.remove(bodyId);
    }

    @GetMapping
    public Flux<Body> getAll() {
        return bodyService.getAll();
    }
}
