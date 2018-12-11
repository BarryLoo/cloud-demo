package com.function;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringCloudApplication
@EnableConfigServer
public class ProjectBoot {
	public static void main(String[] args) {
		SpringApplication.run(ProjectBoot.class);
	}
}
