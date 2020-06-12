package com.lopamoko.smoke.product.vape.accessory.rubber;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/vape/accessory/rubbers")
@RequiredArgsConstructor
public class RubberController {
    private final RubberService rubberService;

    @GetMapping("/{id}")
    public Mono<Rubber> get(@PathVariable("id") String rubberId) {
        return rubberService.get(rubberId);
    }

    @PostMapping
    public Mono<Rubber> create(@RequestBody Rubber rubber) {
        return rubberService.create(rubber);
    }

    @PutMapping
    public Mono<Rubber> update(@RequestBody Rubber rubber) {
        return rubberService.update(rubber);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String rubberId) {
        return rubberService.remove(rubberId);
    }

    @GetMapping
    public Flux<Rubber> getAll() {
        return rubberService.getAll();
    }
}
