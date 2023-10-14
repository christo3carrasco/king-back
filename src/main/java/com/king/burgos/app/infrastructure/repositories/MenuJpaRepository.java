package com.king.burgos.app.infrastructure.repositories;

import com.king.burgos.app.domain.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuJpaRepository extends JpaRepository<Menu, Integer> {
}
