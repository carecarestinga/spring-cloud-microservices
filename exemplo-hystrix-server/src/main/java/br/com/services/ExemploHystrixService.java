package br.com.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ExemploHystrixService {

	@HystrixCommand(fallbackMethod = "fallbackExemplo")
	public String exemplo() {
		return new RestTemplate().getForObject("falha.com", String.class);
	}
	
	public String fallbackExemplo() {
		return "Exemplo - Fallback Error!";
	}
}
