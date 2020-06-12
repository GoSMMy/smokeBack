package com.lopamoko.smoke.product.hookahs.valve;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hookahs/valve")
@RequiredArgsConstructor
public class ValveController {
    private final ValveService valveService;

    @GetMapping("/{id}")
    public Mono<Valve> get(@PathVariable("id") String valveId) {
        return valveService.get(valveId);
    }

    @PostMapping
    public Mono<Valve> create(@RequestBody Valve valve) {
        return valveService.create(valve);
    }

    @PutMapping
    public Mono<Valve> update(@RequestBody Valve valve) {
        return valveService.update(valve);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String valveId) {
        return valveService.remove(valveId);
    }

    @GetMapping
    public Flux<Valve> getAll() {
        return valveService.getAll();
    }
}
