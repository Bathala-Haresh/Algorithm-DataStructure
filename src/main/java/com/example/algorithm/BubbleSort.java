package com.example.algorithm;
import java.util.*;

import com.example.utility.*;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to sort...");
		int a=sc.nextInt();
		System.out.println("Enter integers for sorting...");
		int[] b = new int[a];
		for (int i = 0; i < a; i++) 
		{
			int n=sc.nextInt();
			b[i] = n;
		}
		Utility.bubbleSortInt(b, a);
	}
}