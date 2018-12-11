package com.function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@EnableAutoConfiguration
@SpringCloudApplication
public class ProjectBoot {
	public static void main(String[] args) {
		SpringApplication.run(ProjectBoot.class);
	}
}
