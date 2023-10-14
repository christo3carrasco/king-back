package com.king.burgos.app.domain.repositories;

import com.king.burgos.app.domain.entities.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuRepository {
    Menu createMenu(Menu menu);

    List<Menu> readMenu();

    void deleteMenu(int id);

    Optional<Menu> readMenuId(int id);
}
