package com.lopamoko.smoke.product.hookahs.cup;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hookahs/cup")
@RequiredArgsConstructor
public class CupController {
    private final CupService cupService;

    @GetMapping("/{id}")
    public Mono<Cup> get(@PathVariable("id") String cupId) {
        return cupService.get(cupId);
    }

    @PostMapping
    public Mono<Cup> create(@RequestBody Cup cup) {
        return cupService.create(cup);
    }

    @PutMapping
    public Mono<Cup> update(@RequestBody Cup cup) {
        return cupService.update(cup);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String cupId) {
        return cupService.remove(cupId);
    }

    @GetMapping
    public Flux<Cup> getAll() {
        return cupService.getAll();
    }
}
