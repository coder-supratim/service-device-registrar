package com.timsoft.deviceregistrar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.timsoft.deviceregistrar"})
public class ServiceDeviceRegistrarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDeviceRegistrarApplication.class, args);
	}

}

