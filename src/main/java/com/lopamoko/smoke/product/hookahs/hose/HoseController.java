package com.lopamoko.smoke.product.hookahs.hose;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hookahs/hose")
@RequiredArgsConstructor
public class HoseController {
    private final HoseService hoseService;

    @GetMapping("/{id}")
    public Mono<Hose> get(@PathVariable("id") String hoseId) {
        return hoseService.get(hoseId);
    }

    @PostMapping
    public Mono<Hose> create(@RequestBody Hose hose) {
        return hoseService.create(hose);
    }

    @PutMapping
    public Mono<Hose> update(@RequestBody Hose hose) {
        return hoseService.update(hose);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String hoseId) {
        return hoseService.remove(hoseId);
    }

    @GetMapping
    public Flux<Hose> getAll() {
        return hoseService.getAll();
    }
}
