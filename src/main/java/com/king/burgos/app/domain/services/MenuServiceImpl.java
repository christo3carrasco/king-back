package com.king.burgos.app.domain.services;

import com.king.burgos.app.domain.dto.MenuDTO;
import com.king.burgos.app.domain.entities.Menu;
import com.king.burgos.app.infrastructure.repositories.MenuRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepositoryImpl menuRepository;

    @Override
    public Menu createMenu(Menu menu) {
        return menuRepository.createMenu(menu);
    }

    @Override
    public List<Menu> readMenu() {
        return menuRepository.readMenu();
    }

    @Override
    public Menu updateMenu(int id, MenuDTO menuDTO) {
        Menu updateMenu = menuRepository.readMenuId(id).orElse(null);
        if (updateMenu != null) {
            updateMenu.setDescription(menuDTO.getDescription());
            updateMenu.setPhoto(menuDTO.getPhoto());
            updateMenu.setPrice(menuDTO.getPrice());
        }
        return menuRepository.createMenu(updateMenu);
    }

    @Override
    public void deleteMenu(int id) {
        menuRepository.deleteMenu(id);
    }

    @Override
    public Optional<Menu> readMenuId(int id) {
        return menuRepository.readMenuId(id);
    }
}
