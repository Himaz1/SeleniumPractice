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
			//System.out.println(arr[i]);
		
		}
		
		//System.out.println("The hightest number is:" + arr[5]);
		//System.out.println("The second hightest number is:" + arr[4]); 
		
		System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
     // Finding the largest and second largest values
        System.out.println("The highest number is: " + arr[arr.length - 1]);
        System.out.println("The second highest number is: " + arr[arr.length - 2]);
        
        for(int out:arr)
        {
        	System.out.println(out);
        }

        // Finding the largest and second largest values
        System.out.println("The highest number is: " + arr[arr.length - 1]);
        System.out.println("The second highest number is: " + arr[arr.length - 2]);

	}

}
