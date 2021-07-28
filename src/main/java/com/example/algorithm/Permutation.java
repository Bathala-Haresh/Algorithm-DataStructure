/**
 * @author Bathala Haresh
 * @since 28-july-2021
 * @version 1.0
 * 
 * Purpose:program to find permutations of a string 
 */
package com.example.algorithm;

import java.util.Scanner;

import com.example.utility.Utility;

public class Permutation {
	// Driver code
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Utility.printPermution(s, "");
	}
}