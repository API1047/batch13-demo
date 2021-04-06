package com.apisero;
import java.util.Date;
public class Example2 {
	public static int add(int a, int b) {
		return a + b;
	}
	protected static int subtract(int a, int b) {
		return a - b;
	}
	static int multiply(int a, int b) {
		return a * b;
	}
	private static float divide(int a, int b) {
		return (float) a / b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.round(1.238));
		System.out.println(Math.min(100, 200));
		System.out.println(Math.max(100, 200));
		System.out.println(Math.multiplyHigh(2, 5));
		System.out.println(Math.pow(2, 5));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('B'));
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isAlphabetic('@'));
		System.out.println(Character.toString('8'));
		System.out.println("xyz".indexOf("yz"));
		System.out.println("my my my my".replace("my", "Delhi"));
		System.out.println("my my my my".replaceFirst(" ", "_"));
		System.out.println();
		System.out.println("This is fun".toUpperCase());
		String[] test = "my my my my".split(" ");
		for(int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		int[] m = new int[7];
		int j = 0;
		for(int i = 35; i <= 66; i += 5) {
			m[j] = i;
			j++;
		}
		for(int i = 0; i < m.length; i++) {
			 System.out.print(m[i] + " ");
		}
		int a = 5, b = 3;
		System.out.println();
		System.out.println(add(a, b));
		System.out.println(subtract(a, b));
		System.out.println(multiply(a, b));
		System.out.println(divide(a, b));
		
	}

}
