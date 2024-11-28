package com.qa.questions;

public class PracStringMethods {
	public static void main(String[] args) {
        // Using the + operator for concatenation
        String str1 = "Hello";
        String str2 = "World";
        
        String result1 = str1 + " " + str2;  // Concatenation using + operator
        System.out.println("Concatenation using +: " + result1);

        // Using the concat() method for concatenation
        String result2 = str1.concat(" ").concat(str2);  // Concatenation using concat() method
        System.out.println("Concatenation using concat(): " + result2);
        
        String one = "Himaz";
        String two = "Ahamed";
        String three = one.concat(" ").concat(two);
        System.out.println("My name is: " + three);
        
        String four = "          Himaz   Khalid  Shaza Hana Haya Nifla        ";
        System.out.println("When trim: " + four.trim());
        
        String five = "Testing is my profession";
        System.out.println(five.contains("Testing"));
        
        String six = "Hellow how are you";
        System.out.println(six.startsWith("Hi"));
        
        String seven = "Hellow how are you";
        System.out.println(seven.endsWith("you"));
        
        String eight = "My name is Himazzz Ahamed";
        System.out.println(eight.replace("zzz", "z"));
        
        String nine = "    Hello wold  @@@ Sri lanka";
        System.out.println(nine.replaceAll("    Hello wold  @@@ Sri lanka", "HIMAZ"));
	}

}
