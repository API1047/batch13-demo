package com.codejam;


public class B extends A {
	public int add(int a, int b) {
		return a + b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public float div(int a, int b) {
		return (float) a / b;
	}
	public int preinc(int a) {
		return ++a;
	}
	public int postinc(int a) {
		return a++;
	}
	public int predec(int a) {
		return --a;
	}
	public int postdec(int a) {
		return a--;
	}
	public static void main(String[] args) {
	}
    public void display(){
		System.out.println("I am from class B display");
	}
}

