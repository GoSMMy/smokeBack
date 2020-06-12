package com.lopamoko.smoke.product.vape.liquid;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/products/liquids")
@RequiredArgsConstructor
@Tag(name = "Liquids", description = "Performs all operations with vape liquids")
public class LiquidController {
    private final LiquidService liquidService;

    @GetMapping("/{id}")
    @Operation(summary = "Find liquid by Id", tags = "Liquids")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Liquid found successfully")
    })
    public Mono<Liquid> findById(@PathVariable("id") String liquidId) {
        return liquidService.findById(liquidId);
    }

    @GetMapping
    @Operation(summary = "Find all liquids", description = "Find all liquids by page request", tags = "Liquids")
    public Flux<Liquid> findAll(LiquidRequest liquidRequest) {
        return liquidService.findAll(liquidRequest);
    }

    @PostMapping
    @Operation(summary = "Create new Liquid", description = "Creating a new liquid based on a new model", tags = "Liquids")
    public Mono<Liquid> create(@RequestBody Liquid liquid) {
        return liquidService.create(liquid);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update liquid", description = "Liquid model update based on the arrived model", tags = "Liquids")
    public Mono<Liquid> update(@PathVariable("id") String liquidId, @RequestBody Liquid liquid) {
        return liquidService.update(liquidId, liquid);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove liquid", description = "Removal liquid by id", tags = "Liquids")
    public Mono<Void> remove(@PathVariable("id") String liquidId) {
        return liquidService.remove(liquidId);
    }
}
