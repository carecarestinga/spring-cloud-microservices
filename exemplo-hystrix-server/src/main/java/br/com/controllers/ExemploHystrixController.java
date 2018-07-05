package br.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.services.ExemploHystrixService;

@RestController
@RequestMapping("/exemplo")
public class ExemploHystrixController {
	
	@Autowired
	ExemploHystrixService exemploHystrixService;

	@GetMapping(value = "/")
    public ResponseEntity teste() {
		return ResponseEntity.ok(this.exemploHystrixService.exemplo());
	}
	
	@GetMapping(value = "/zuul")
    public ResponseEntity teste2() {
		return ResponseEntity.ok("API Gateway Zuul");
	}
}
