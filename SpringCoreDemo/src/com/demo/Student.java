package com.demo;

public class Student {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo()
	{
		System.out.println("Name is :" +name);
	}

}
