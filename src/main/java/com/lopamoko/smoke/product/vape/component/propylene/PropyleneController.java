package com.lopamoko.smoke.product.vape.component.propylene;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/vape/component/propylene")
@RequiredArgsConstructor
public class PropyleneController {
    private final PropyleneService propyleneService;

    @GetMapping("/{id}")
    public Mono<Propylene> get(@PathVariable("id") String propyleneId) {
        return propyleneService.get(propyleneId);
    }

    @PostMapping
    public Mono<Propylene> create(@RequestBody Propylene propylene) {
        return propyleneService.create(propylene);
    }

    @PutMapping
    public Mono<Propylene> update(@RequestBody Propylene propylene) {
        return propyleneService.update(propylene);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String propyleneId) {
        return propyleneService.remove(propyleneId);
    }

    @GetMapping
    public Flux<Propylene> getAll() {
        return propyleneService.getAll();
    }
}
