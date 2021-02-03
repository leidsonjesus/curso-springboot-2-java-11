package com.leidsonjesus.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leidsonjesus.curso.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "Maria@email.com", "99999", "12444");
		return ResponseEntity.ok().body(u);
				
	}

}
