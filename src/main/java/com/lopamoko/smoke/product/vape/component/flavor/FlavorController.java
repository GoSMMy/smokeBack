package com.lopamoko.smoke.product.vape.component.flavor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/vape/component/flavor")
@RequiredArgsConstructor
public class FlavorController {
    private final FlavorService flavorService;

    @GetMapping("/{id}")
    public Mono<Flavor> get(@PathVariable("id") String flavorId) {
        return flavorService.get(flavorId);
    }

    @PostMapping
    public Mono<Flavor> create(@RequestBody Flavor flavor) {
        return flavorService.create(flavor);
    }

    @PutMapping
    public Mono<Flavor> update(@RequestBody Flavor flavor) {
        return flavorService.update(flavor);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String flavorId) {
        return flavorService.remove(flavorId);
    }

    @GetMapping
    public Flux<Flavor> getAll() {
        return flavorService.getAll();
    }
}
