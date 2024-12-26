package com.qa.questions;

import java.util.Scanner;

public class UserInputSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to add? ");
		int n = sc.nextInt();
		System.out.println("Please enter " + n + " numbers one by one and hit Enter key");
		int[] arr = new int[n];
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
		System.out.println("Larges no in the array is: " + arr[arr.length-1]);
		sc.close();
	}

}
