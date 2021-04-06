package com.apisero;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 5, b = 7;
//		System.out.println("Arithmetic Operator");
//		System.out.println("Addition: " + (a + b));
//		System.out.println("Subtraction: " + (a - b));
//		System.out.println("Multiplication: " + (a * b));
//		System.out.println("Division: " + (a / b));
//		System.out.println("PostIncrement: " + (a++));
//		System.out.println("Pre Increment: " + (++a));
//		System.out.println("Post Decrement: " + a--);
//		System.out.println("Pre Decrement: " + --a);
//		System.out.println();
//		
//		System.out.println("Comparison Operator");
//		System.out.println("Equal to: " + (a == b));
//		System.out.println("Greater than or equal to: " + (a >= b));
//		System.out.println("Less than or equal to: " + (a <= b));
//		System.out.println("Not Equal to: " + (a != b));
//		System.out.println("Greater than" + (a > b));
//		System.out.println("Less than" + (a < b));
//		System.out.println();
//		
//		System.out.println("Bitwise Operator");
//		System.out.println("OR: " + (a | b));
//		System.out.println("AND: " + (a & b));
//		System.out.println("XOR " + (a ^ b));
//		System.out.println("NOT: " + (~a));
//		System.out.println("LEFT SHIFT: " + (a << 2));
//		System.out.println("RIGHT SHIFT:" + (a >> 2));
//		System.out.println();
//		
//		int p = 8, q = 3;
//		System.out.println("Logical Operator");
//		System.out.println("AND: " + (a < b && p < q));
//		System.out.println("OR: " + (a < b || p < q));
//		System.out.println("NOT: " + !((a >= b && b < q) || p > b));
//		System.out.println();
//
//		System.out.println("Assignment Operator");
//		a -= b;
//		System.out.println("a-=b: " + a);
//		a += b;
//		System.out.println("a+=b: " + a);
//		p /= a;
//		System.out.println("p/=a: " + p);
//		q *= b;
//		System.out.println("q*=b: " + q);
//		int m = a;
//		System.out.println("m=a: " + m);
//		p %= a;
//		System.out.println("p%=a: " + p);
//		p ^= q;
//		System.out.println("p^=a: " + p);
//		p <<= m;
//		System.out.println("p<<=m: " + p);
//		p >>= q;
//		System.out.println("p>>=q: " + p);
//		p &= m;
//		System.out.println("p&=q: " + p);
//		p |= m;
//		System.out.println("p|=q: " + p);
//		System.out.println();
		
		int m = 9, n = 12, choice = 3;
//		switch(choice) {
//		case 1: System.out.println("m + n: " + (m + n));
//				break;
//		case 2: System.out.println("m * n: " + (m * n));
//				break;
//		case 3: System.out.println("m / n: " + ((float) m / n));
//				break;
//		case 4: System.out.println("m - n: " + (m - n));
//				break;
//		default: System.out.println("Wrong Value Entered");
//		}
		
		if(m > n) {
			System.out.println("m is greater than n");
		}else if(m < n) {
			System.out.println("m is lesser than n");
			if(m < n - 5) System.out.println("m is 5 or more less than n");
			else System.out.println("m is only 5 or less less than n");
		}else
			System.out.println("m is equal to n");
		
		int i = 0;
		
		System.out.println("For Loop:");
		for(i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		i = 0;
		
		System.out.println("Do While Loop: ");
		do {
			System.out.print(m + " ");
			m++;
		}while(m < 5);
		
		i = 0;
		
		System.out.println("While Loop:");
		while(i < 5) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("Continue and Break:");
		for(; i < 100; m += 5) {
			if(m > 50) {
				break;
			}
			if(m % 2 == 0) {
				System.out.print(m + " ");
			}else {
				m += 9;
			}
		}
		
		
	}

	
}
