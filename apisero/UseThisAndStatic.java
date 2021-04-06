package com.apisero;

public class UseThisAndStatic {
	int age;
	int salary;
	static final String company = "Apisero";
	UseThisAndStatic(int age, int salary){
		this.age = age;
		this.salary = salary;
	}
	public void display() {
		System.out.println(age + " " + salary + " " + company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseThisAndStatic ob = new UseThisAndStatic(18, 25000);
		ob.display();
	}

}
