package com.lopamoko.smoke.product.hookahs.flask;


import com.lopamoko.smoke.product.hookahs.cup.Cup;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hookahs/flask")
@RequiredArgsConstructor
public class FlaskController {
    private final FlaskService flaskService;

    @GetMapping("/{id}")
    public Mono<Flask> get(@PathVariable("id") String flaskId) {
        return flaskService.get(flaskId);
    }

    @PostMapping
    public Mono<Flask> create(@RequestBody Flask flask) {
        return flaskService.create(flask);
    }

    @PutMapping
    public Mono<Flask> update(@RequestBody Flask flask) {
        return flaskService.update(flask);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable("id") String flaskId) {
        return flaskService.remove(flaskId);
    }

    @GetMapping
    public Flux<Flask> getAll() {
        return flaskService.getAll();
    }
}
