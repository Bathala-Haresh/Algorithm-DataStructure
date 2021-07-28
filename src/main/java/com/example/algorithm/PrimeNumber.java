/**
 * @author Bathala Haresh
 * @since 28-july-2021
 * @version 1.0
 * 
 * Purpose:program to find prime number with in a range
 */
package com.example.algorithm;

import java.util.Scanner;

import com.example.utility.Utility;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		//scanner class object creation
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		//input from user
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		Utility.prime(start, end);
	}	
}
