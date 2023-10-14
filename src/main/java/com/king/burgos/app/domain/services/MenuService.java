package com.king.burgos.app.domain.services;

import com.king.burgos.app.domain.dto.MenuDTO;
import com.king.burgos.app.domain.entities.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    Menu createMenu(Menu menu);

    List<Menu> readMenu();

    Menu updateMenu(int id, MenuDTO menuDTO);

    void deleteMenu(int id);

    Optional<Menu> readMenuId(int id);
}
