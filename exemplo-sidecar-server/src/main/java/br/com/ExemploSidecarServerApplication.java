package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class ExemploSidecarServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploSidecarServerApplication.class, args);
	}
}
