package com.lopamoko.smoke.product.vape.atomizer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/products/atomizer")
@RequiredArgsConstructor
public class AtomizerController {
    private final AtomizerService atomizerService;

    @GetMapping("/{id}")
    public Mono<Atomizer> get(@PathVariable("id") String atomizerId) {
        return atomizerService.get(atomizerId);
    }

    @PostMapping
    public Mono<Atomizer> create(@RequestBody Atomizer atomizer) {
        return atomizerService.create(atomizer);
    }

    @PutMapping
    public Mono<Atomizer> update(@RequestBody Atomizer atomizer) {
        return atomizerService.update(atomizer);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String atomizerId) {
        return atomizerService.remove(atomizerId);
    }

    @GetMapping
    public Flux<Atomizer> find(AtomizerRequest atomizerRequest) {
        return atomizerService.find(atomizerRequest);
    }
}
