package com.king.burgos.app.application.controllers;

import com.king.burgos.app.domain.dto.MenuDTO;
import com.king.burgos.app.domain.entities.Menu;
import com.king.burgos.app.domain.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/menu", produces = {"application/json"})
public class MenuControllerImpl implements MenuController {
    @Autowired
    private MenuService menuService;

    @Override
    public Menu postMenu(MenuDTO menuDTO) {
        Menu menu = new Menu();
        menu.setDescription(menuDTO.getDescription());
        menu.setPhoto(menuDTO.getPhoto());
        menu.setPrice(menuDTO.getPrice());
        return menuService.createMenu(menu);
    }

    @Override
    public List<Menu> getMenu() {
        return menuService.readMenu();
    }

    @Override
    public Optional<Menu> getMenu(int id) {
        return menuService.readMenuId(id);
    }

    @Override
    public Menu putMenu(int id, MenuDTO menuDTO) {
        return menuService.updateMenu(id, menuDTO);
    }

    @Override
    public void deleteMenu(int id) {
        menuService.deleteMenu(id);
    }
}
