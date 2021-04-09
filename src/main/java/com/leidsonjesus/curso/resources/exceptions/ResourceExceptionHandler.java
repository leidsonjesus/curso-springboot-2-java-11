package com.leidsonjesus.curso.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.leidsonjesus.curso.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	public ResponseEntity<StandardError> resourseNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		   String error = "Resource not Found";
		   HttpStatus status = HttpStatus.NOT_FOUND;
		   StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		   return ResponseEntity.status(status).body(err);
	}

}
