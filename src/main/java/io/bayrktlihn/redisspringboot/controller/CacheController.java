package io.bayrktlihn.redisspringboot.controller;

import io.bayrktlihn.redisspringboot.model.User;
import io.bayrktlihn.redisspringboot.service.CacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users/cache")
public class CacheController {

    private final CacheService cacheService;

    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }


    @PostMapping(path = "")
    public User cacheUser(@RequestBody User user) {
        return cacheService.cacheUser(user);
    }

    @GetMapping(path = "/{name}")
    public User getCachedUserByName(@PathVariable String name) {
        return cacheService.getCachedUserByName(name);
    }
}
