package com.codejam;

public class C extends B {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		C ob = new C();
		System.out.println("a + b: " + ob.add(a, b));
		System.out.println("a - b: " + ob.sub(a, b));
		System.out.println("a / b: " + ob.div(a, b));
		System.out.println("a * b: " + ob.mul(a, b));
		System.out.println("a++: " + ob.postinc(a));
		System.out.println("++a: " + ob.preinc(a));
		System.out.println("a--: " + ob.postdec(a));
		System.out.println("--a: " + ob.predec(a));
		System.out.println("a & b: " + ob.and(a, b));
		System.out.println("a | b: " + ob.or(a, b));
		System.out.println("a ^ b: " + ob.xor(a, b));
		System.out.println("~a: " + ob.neg(a));
		System.out.println("a << b: " + ob.lsh(a, b));
		System.out.println("a >> b: " + ob.rsh(a, b));
	}
}

