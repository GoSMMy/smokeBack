package com.lopamoko.smoke.product.vape.mod;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/products/mods")
@RequiredArgsConstructor
public class ModController {
    private final ModService modService;

    @GetMapping("/{id}")
    public Mono<Mod> get(@PathVariable("id") String modId) {
        return modService.get(modId);
    }

    @PostMapping
    public Mono<Mod> create(@RequestBody Mod mod) {
        return modService.create(mod);
    }

    @PutMapping
    public Mono<Mod> update(@RequestBody Mod mod) {
        return modService.update(mod);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String modId) {
        return modService.remove(modId);
    }

    @GetMapping
    public Flux<Mod> find(ModRequest modRequest) {
        return modService.find(modRequest);
    }
}
