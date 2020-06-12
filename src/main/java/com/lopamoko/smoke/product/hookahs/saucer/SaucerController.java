package com.lopamoko.smoke.product.hookahs.saucer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hookahs/saucer")
@RequiredArgsConstructor
public class SaucerController {
    private final SaucerService saucerService;

    @GetMapping("/{id}")
    public Mono<Saucer> get(@PathVariable("id") String saucerId) {
        return saucerService.get(saucerId);
    }

    @PostMapping
    public Mono<Saucer> create(@RequestBody Saucer saucer) {
        return saucerService.create(saucer);
    }

    @PutMapping
    public Mono<Saucer> update(@RequestBody Saucer saucer) {
        return saucerService.update(saucer);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String saucerId) {
        return saucerService.remove(saucerId);
    }

    @GetMapping
    public Flux<Saucer> getAll() {
        return saucerService.getAll();
    }
}
