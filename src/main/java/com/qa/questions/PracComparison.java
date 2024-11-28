package com.qa.questions;

public class PracComparison {
	public static void main(String[] args) {

        // String Example (Object)
        String str1 = "Hello"; // Original string
        String str2 = str1;    // str2 points to the same object as str1
        str1 = "World";        // str1 now points to a new String object
        System.out.println("str1: " + str1); // Output: World
        System.out.println("str2: " + str2); // Output: Hello

        // int Example (Primitive)
        int num1 = 5;          // num1 is a primitive int
        int num2 = num1;       // num2 copies the value of num1
        num1 = 10;             // num1 is reassigned a new value (primitive)
        System.out.println("num1: " + num1); // Output: 10
        System.out.println("num2: " + num2); // Output: 5 (num2 still holds the original value)

        // Demonstrating Memory References
        System.out.println("Memory reference of str1: " + System.identityHashCode(str1)); 
        System.out.println("Memory reference of str2: " + System.identityHashCode(str2)); 
        // The memory references of str1 and str2 will be different as str1 was reassigned

        System.out.println("Memory reference of num1: " + System.identityHashCode(num1)); // num1 is a primitive, no reference
        System.out.println("Memory reference of num2: " + System.identityHashCode(num2)); // num2 is also a primitive, no reference
    }

}
