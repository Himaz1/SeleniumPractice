package com.qa.tryOut;

import java.util.ArrayList;

public class Check {
	public static void main(String[] args) {
		int[] arr = {5,6,8,24,7,76};
		
//		for (int output:arr)
//		{
//			System.out.println(output);
//		}
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			System.out.println(arr[i]);
		}
		
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(45);
		obj.add(23);
		obj.add(5);
		obj.add(88);
		System.out.println(obj);
	}

}
