package com.lopamoko.smoke.product.vape.accessory.driptip;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/vape/accessory/driptip")
@RequiredArgsConstructor
public class DripTipController {
    private final DripTipService dripTipService;

    @GetMapping("/{id}")
    public Mono<DripTip> get(@PathVariable("id") String dripTipId) {
        return dripTipService.get(dripTipId);
    }

    @PostMapping
    public Mono<DripTip> create(@RequestBody DripTip dripTip) {
        return dripTipService.create(dripTip);
    }

    @PutMapping
    public Mono<DripTip> update(@RequestBody DripTip dripTip) {
        return dripTipService.update(dripTip);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String dripTipId) {
        return dripTipService.remove(dripTipId);
    }

    @GetMapping
    public Flux<DripTip> getAll() {
        return dripTipService.getAll();
    }
}
