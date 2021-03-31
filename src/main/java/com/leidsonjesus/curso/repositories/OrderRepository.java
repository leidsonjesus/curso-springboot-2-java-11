package com.leidsonjesus.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leidsonjesus.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
