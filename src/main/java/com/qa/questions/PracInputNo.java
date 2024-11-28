package com.qa.questions;

import java.util.Scanner;

public class PracInputNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number count:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Please Enter " + n + " numbers one by one and hit Enter key!");
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int out:arr)
		{
			System.out.println(out);
		}
		
	}

}
