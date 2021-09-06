package com.example.messagingstompwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingStompWebsocketInitialApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingStompWebsocketInitialApplication.class, args);
		
		System.out.println("MessagingStompWebsocketInitialApplication Started");
		
		HelloMessage hm=new HelloMessage();
					hm.display();
	}

}
