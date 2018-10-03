package com.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReservationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationProjectApplication.class, args);
	}
}