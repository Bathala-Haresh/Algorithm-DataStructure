/**
 * @author Bathala Haresh
 * @since 28-july-2021
 * @version 1.0
 * 
 * Purpose:program to find a string using merge sort
 */
package com.example.algorithm;

import java.util.Scanner;

import com.example.utility.Utility;

public class MergeSort {
	public static void main(String[]args) 
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no. of elements:");
		int n=s.nextInt();

		int[] a=new int[n];
		System.out.print("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Utility.sort(n, a);
		System.out.print("Sorted elements:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");		
		}
	}
}