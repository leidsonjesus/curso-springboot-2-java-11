package com.leidsonjesus.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leidsonjesus.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
