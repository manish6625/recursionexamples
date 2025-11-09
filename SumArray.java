package com.codegnan.oopsmethods;

import java.util.Scanner;

public class SumArray {
	public static int sum(int arr[],int n) {
		if(n==0) {
			return arr[0];
		}
		return arr[n]+sum(arr,n-1);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int s=sum(arr,n-1);
		System.out.println(s);
		sc.close();
		
	}

}
