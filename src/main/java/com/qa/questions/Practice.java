package com.qa.questions;

public class Practice {

	public static void main(String[] args) {
		int[] arr = {9, 10, 3, 2, 5, 8};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]> arr[j])
				{
					int temp= arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		
		}
		
		//int[] arr2 =  

	}

}
