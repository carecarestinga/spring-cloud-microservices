package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import br.com.filters.pre.PreFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ExemploZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploZuulServerApplication.class, args);
	}
	
	@Bean
	public PreFilter simpleFilter() {
		return new PreFilter();
	}
}
