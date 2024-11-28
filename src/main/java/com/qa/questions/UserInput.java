package com.qa.questions;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number count: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Please enter " + n + " numbers");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending order: ");
		for(int out:arr)
		{
			System.out.println(out);
		}
		System.out.println("The largest no is: " + arr[arr.length-1]);
		System.out.println("The largest no is: " + arr[arr.length-2]);
	}

}
