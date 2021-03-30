package com.leidsonjesus.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leidsonjesus.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
