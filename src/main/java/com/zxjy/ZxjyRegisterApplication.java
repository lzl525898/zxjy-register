package com.zxjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZxjyRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZxjyRegisterApplication.class, args);
	}

}
