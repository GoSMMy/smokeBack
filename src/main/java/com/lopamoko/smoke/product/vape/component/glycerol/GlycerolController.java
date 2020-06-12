package com.lopamoko.smoke.product.vape.component.glycerol;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/vape/component/glycerol")
@RequiredArgsConstructor
public class GlycerolController {
    private final GlycerolService glycerolService;

    @GetMapping("/{id}")
    public Mono<Glycerol> get(@PathVariable("id") String glycerolId) {
        return glycerolService.get(glycerolId);
    }

    @PostMapping
    public Mono<Glycerol> create(@RequestBody Glycerol glycerol) {
        return glycerolService.create(glycerol);
    }

    @PutMapping
    public Mono<Glycerol> update(@RequestBody Glycerol glycerol) {
        return glycerolService.update(glycerol);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String glycerolId) {
        return glycerolService.remove(glycerolId);
    }

    @GetMapping
    public Flux<Glycerol> getAll() {
        return glycerolService.getAll();
    }
}
