/**
 * @author Haresh
 * @since 28-july-2021
 * @version 1.0
 * 
 * Purpose:T=program to find an anagram 
 */
package com.example.algorithm;
import java.util.Scanner;

import com.example.utility.*;


public class Anagram {
	public static void main(String args[]) 
	{ 
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First String : ");
		String word1 = sc.nextLine();
		System.out.print("Enter second String :");
		String word2 = sc.nextLine();
		Utility.isAnagram(word1, word2);
	}
	
}