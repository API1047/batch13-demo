package com.codejam;

interface D {
	void display();
	void calc();
	public static void main(String[] args) {
		E ob = new E();
		ob.display();
	}
	
	

}
class E implements D{
	public void display() {
		System.out.println("IN E");
	}
	public void calc() {
		
	}
}
 