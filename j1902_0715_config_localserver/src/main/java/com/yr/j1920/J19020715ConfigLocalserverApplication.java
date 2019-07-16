package com.yr.j1920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer//开启配置中心服务
@SpringBootApplication
public class J19020715ConfigLocalserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(J19020715ConfigLocalserverApplication.class, args);
	}

}
