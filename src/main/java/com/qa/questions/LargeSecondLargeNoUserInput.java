package com.qa.questions;
import java.util.Scanner;

public class LargeSecondLargeNoUserInput {
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array of size n
        int[] arr = new int[n];
        
        // Take input for each element in the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array in ascending order using bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Check if there are enough elements to find the largest and second largest
        if (arr.length >= 2) {
            // Finding the largest and second largest values
            System.out.println("The highest number is: " + arr[arr.length - 1]);
            System.out.println("The second highest number is: " + arr[arr.length - 2]);
        } else {
            System.out.println("The array does not have enough elements to find the largest and second largest.");
        }

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }

}
