package com.bridgelabz;

import java.util.Scanner;

public class StringsEqual {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first string1: ");
        String string1 = scan.nextLine();
  
        System.out.println("Enter the first string2: ");
        String string2 = scan.nextLine();
  
        if (string1.equals(string2) == true) {
            System.out.println("String1 and String2 are equal");
        }
        else {
            System.out.println("String1 and String2 are not equal");
        }
    }
}
