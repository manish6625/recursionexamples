package com.codegnan.oopsmethods;

import java.util.Scanner;

public class Exponent {
	public static int Power(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a*Power(a,b-1);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Power(a,b));
		sc.close();
		
	}

}
