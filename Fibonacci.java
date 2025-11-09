package com.codegnan.oopsmethods;

import java.util.Scanner;

public class Fibonacci {
	public static long fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
			return fibonacci(n-1)+fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Fibonacci f=new Fibonacci();
		System.out.println(fibonacci(n));
		sc.close();
		
	}

}


