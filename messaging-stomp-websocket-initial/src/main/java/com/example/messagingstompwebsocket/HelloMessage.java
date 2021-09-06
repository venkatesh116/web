package com.example.messagingstompwebsocket;

public class HelloMessage {

	private String name;
	
	
	
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("This is Hello Message Class");
		}

	public HelloMessage() {
	}

	public HelloMessage(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
}
