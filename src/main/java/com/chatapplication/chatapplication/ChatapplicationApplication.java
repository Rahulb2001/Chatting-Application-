package com.chatapplication.chatapplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ChatapplicationApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChatapplicationApplication.class, args);
		log.info("Application started");
	}

}
