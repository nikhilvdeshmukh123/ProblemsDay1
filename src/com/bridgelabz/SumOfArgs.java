package com.bridgelabz;

/*
 * @author: Nikhil
 * Get the sum of command line and invalid integers
 */
public class SumOfArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 0, sum = 0;
		int[] array = new int[0];
		for (int i = 0; i < array.length; i++) {
			try {
				n = Integer.parseInt(null);
				sum = sum + n;
			} catch (NumberFormatException e) {
				count++;
			}
		}
		System.out.println("Sum of only valid integers: " + sum);
		System.out.println("Invalid Integers: " + count);
	}
}