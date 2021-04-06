package com.codejam;

public class ExceptionHandling {
	int divide(int a, int b) throws Exception {
		return a / b;
	}
	public static void main(String[] args) {
		try {
			int arr[] = new int [5];
			arr[10] = 100;
			int a = 10;
			int b = 10;
			System.out.println(a+b);
			
		}catch(ArrayIndexOutOfBoundsException e){
			throw e;
		}finally {
			System.out.println("We are in finally block");
		}
	}
}

