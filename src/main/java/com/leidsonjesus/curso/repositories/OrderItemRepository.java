package com.leidsonjesus.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leidsonjesus.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
