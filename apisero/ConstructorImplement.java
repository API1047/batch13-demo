package com.apisero;

public class ConstructorImplement {
	ConstructorImplement(String name, int id){
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Inside Two Parameter Constructor");
	}
	ConstructorImplement(String name, int id, int age){
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Inside Three Parameter Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorImplement ob1 = new ConstructorImplement("Apisero", 1047);
		ConstructorImplement ob2 = new ConstructorImplement("Apisero", 1047, 4);
	}

}
