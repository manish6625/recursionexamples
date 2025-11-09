package com.codegnan.oopsmethods;

import java.util.Scanner;

public class ReverseSum {
	public static void reversesum(int arr[],int start, int end) {
		if(start>=end) 
			return ;
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reversesum(arr,start+1,end-1);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//ReverseSum r=new ReverseSum();
		reversesum(arr,0,n-1);
		//System.out.println(s);
		for(int num:arr) {
			System.out.print(num+" ");
		}
		sc.close();

	}

}
