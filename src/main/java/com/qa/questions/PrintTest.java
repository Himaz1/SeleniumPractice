package com.qa.questions;

import java.util.Scanner;

public class PrintTest {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("1");
			}
			System.out.println();
		}
		
		for(int i=1; i<6; i++)
		{
			for(int j=i; j<i+i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int n = sc.nextInt();
		System.out.println("Please enter " + n + " numbers");
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
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int out:arr)
		{
			System.out.println(out);
		}
		System.out.println("Largest number in the array is" + arr[arr.length-1]);
	}

}
