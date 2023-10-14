package com.king.burgos.app.infrastructure.repositories;

import com.king.burgos.app.domain.entities.Menu;
import com.king.burgos.app.domain.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MenuRepositoryImpl implements MenuRepository {
    @Autowired
    MenuJpaRepository db;

    @Override
    public Menu createMenu(Menu menu) {
        return db.save(menu);
    }

    @Override
    public List<Menu> readMenu() {
        return db.findAll();
    }

    @Override
    public void deleteMenu(int id) {
        db.deleteById(id);
    }

    @Override
    public Optional<Menu> readMenuId(int id) {
        return db.findById(id);
    }
}
