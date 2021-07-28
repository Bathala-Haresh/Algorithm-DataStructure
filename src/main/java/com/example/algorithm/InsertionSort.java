/**
 * @author Bathala Haresh
 * @since 28-july-2021
 * @version 1.0
 * 
 * Purpose:program to find a string using Insertion sort
 */
package com.example.algorithm;

import java.util.*;

import com.example.utility.Utility;
public class InsertionSort {
	public static void main(String[]args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many strings you have to enter:");
		int n=sc.nextInt();
		String[] str = new String [n];
		System.out.print("Enter the strings:");
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		Utility.sorting(str);
	}
}
