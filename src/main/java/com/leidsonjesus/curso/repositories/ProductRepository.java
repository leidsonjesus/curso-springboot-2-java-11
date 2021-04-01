package com.leidsonjesus.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leidsonjesus.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
