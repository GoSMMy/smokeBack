package com.lopamoko.smoke.product.vape.mechanical;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/vape/mechanical")
@RequiredArgsConstructor
public class MechanicalController {
    private final MechanicalService mechanicalService;

    @GetMapping("/{id}")
    public Mono<Mechanical> get(@PathVariable("id") String mechanicalId) {
        return mechanicalService.get(mechanicalId);
    }

    @PostMapping
    public Mono<Mechanical> create(@RequestBody Mechanical mechanical) {
        return mechanicalService.create(mechanical);
    }

    @PutMapping
    public Mono<Mechanical> update(@RequestBody Mechanical mechanical) {
        return mechanicalService.update(mechanical);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String mechanicalId) {
        return mechanicalService.remove(mechanicalId);
    }

    @GetMapping
    public Flux<Mechanical> getAll() {
        return mechanicalService.getAll();
    }
}
