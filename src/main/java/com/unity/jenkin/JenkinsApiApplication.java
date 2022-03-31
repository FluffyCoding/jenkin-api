package com.unity.jenkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsApiApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApiApplication.class, args);
		logger.info("Application Executed...");
	}

	@PostConstruct
	public void init(){
		logger.info("Application Started...");
	}

}
