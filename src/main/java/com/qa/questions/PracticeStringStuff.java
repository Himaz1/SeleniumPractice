package com.qa.questions;

public class PracticeStringStuff {
	public static void main(String[] args) {
		
		int a = 4;
		a = a+5;
		 // Create a String object
        String str1 = "Hello";
        System.out.println("Original String: " + str1);

        // Try to modify the string (this does NOT change the original string)
        str1 = str1 + " World"; // Concatenating strings
        str1 = "Worldnew";
        System.out.println("Modified String: " + str1);

        // Create another String object to show that the original one is unchanged
        String str2 = "Hello";
        System.out.println("Original String after modification: " + str2);

        // Check if the original string (str2) is equal to the modified string (str1)
        System.out.println("Are the original and modified strings equal? " + str1.equals(str2));

        // Show memory references of the original and modified strings
        System.out.println("Memory reference of original string (str2): " + System.identityHashCode(str2));
        System.out.println("Memory reference of modified string (str1): " + System.identityHashCode(str1));

	}

}
