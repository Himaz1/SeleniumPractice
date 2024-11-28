package com.qa.questions;

public class PracSplitSubSring {
	public static void main(String[] args) {
        // Example string with commas as delimiter
        String str = "apple,banana,orange,grape";
        
        // Using split() method to split the string by commas
        String[] fruits = str.split(",");
        
        // Printing the resulting array
        System.out.println("Fruits array:");
        for (String output : fruits) {
            System.out.println(output);
        }
        
        
        String strOne = "Hello, World!";
        
        // Using substring() to extract part of the string
        String sub1 = strOne.substring(7);  // Extracts from index 7 to the end
        String sub2 = strOne.substring(0, 5);  // Extracts from index 0 to 4
        
        // Printing the substrings
        System.out.println("Substring from index 7: " + sub1);  // Output: World!
        System.out.println("Substring from index 0 to 5: " + sub2);  // Output: Hello
    }

}
