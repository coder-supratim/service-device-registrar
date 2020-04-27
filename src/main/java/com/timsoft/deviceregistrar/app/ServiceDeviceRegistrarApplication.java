package com.timsoft.deviceregistrar.app;

import com.github.lalyos.jfiglet.FigletFont;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.timsoft.deviceregistrar"})
public class ServiceDeviceRegistrarApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ServiceDeviceRegistrarApplication.class, args);
		log.info(FigletFont.convertOneLine("Device Registrar"));
	}
}
