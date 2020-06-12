package com.lopamoko.smoke.product.hookahs.tabacco;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hookahs/tabacco")
@RequiredArgsConstructor
public class TabaccoController {
    private final TabaccoService tabaccoService;

    @GetMapping("/{id}")
    public Mono<Tabacco> get(@PathVariable("id") String tabaccoId) {
        return tabaccoService.get(tabaccoId);
    }

    @PostMapping
    public Mono<Tabacco> create(@RequestBody Tabacco tabacco) {
        return tabaccoService.create(tabacco);
    }

    @PutMapping
    public Mono<Tabacco> update(@RequestBody Tabacco tabacco) {
        return tabaccoService.update(tabacco);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String tabaccoId) {
        return tabaccoService.remove(tabaccoId);
    }

    @GetMapping
    public Flux<Tabacco> getAll() {
        return tabaccoService.getAll();
    }
}
