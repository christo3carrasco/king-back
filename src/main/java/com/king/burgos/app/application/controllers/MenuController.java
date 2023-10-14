package com.king.burgos.app.application.controllers;

import com.king.burgos.app.domain.dto.MenuDTO;
import com.king.burgos.app.domain.entities.Menu;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface MenuController {
    @PostMapping(consumes = {"application/json"})
    Menu postMenu(@RequestBody MenuDTO menuDTO);

    @GetMapping
    List<Menu> getMenu();

    @GetMapping(value = "/{id}")
    Optional<Menu> getMenu(@PathVariable(value = "id") int id);

    @PutMapping(value = "/{id}", consumes = {"application/json"})
    Menu putMenu(@PathVariable(value = "id") int id, @RequestBody MenuDTO menuDTO);

    @DeleteMapping(value = "/{id}")
    void deleteMenu(@PathVariable(value = "id") int id);
}
