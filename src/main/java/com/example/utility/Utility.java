package com.example.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Utility {
	private static BufferedReader bufferReader;
	static Scanner scanner=new Scanner(System.in);

	public static boolean isAnagram(String str1,String str2)
	{
		int n1 = str1.length();
		int n2 = str2.length(); 

		char[] l = str1.toCharArray();
		char[] r = str2.toCharArray();

		if(n1!=n2){
			System.out.println("Given strings are not anagrams");
		}

		else{
			Arrays.sort(l); 
			Arrays.sort(r); 


			if(Arrays.equals(l,r)) { 
				System.out.println("Given strings are anagrams");
			} 
			else {
				System.out.println("Given strings are not anagrams");
			}

		}
		return false;
	}
	//To Read File
	public static FileReader fileRead(String string)
	{
		FileReader f = null;
		try {
			f = new FileReader(string);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return f;   
	}
	//To write into file
	public static FileWriter fileWrite(String string)
	{
		FileWriter f = null;
		try
		{
			f = new FileWriter(string);
		}
		catch (IOException e)
		{
			//
			e.printStackTrace();
		}
		return f;   
	}


	// Returns index of x if it is present in arr[],
	// else return -1
	public static int binarySearch(String[] arr, String x)
	{
		int left= 0, right= arr.length - 1;
		while (left <= right) {
			//calculating mid value
			int mid= left + (right - left) / 2;
			int res = x.compareTo(arr[mid]);

			// Check if key is present at mid
			if (res == 0)
				return mid;

			// If key  greater, ignore left half
			else if (res > 0) {
				left= mid + 1;
			}
			// If key  is smaller, ignore right half
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
	//method to find Bubble sort
	public static void bubbleSortInt(int[] a, int b) 
	{
		int i,j,temp;
		for(i=0;i<b-1;i++)
		{
			for(j=i+1;j<b;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nbubble sorting of integer array...");
		for(i=0;i<b;i++)
		{
			System.out.print(a[i]+",");
		}

	}
	public static int guess(int lo, int hi) {
		if ((hi - lo) == 1) 
			return lo;

		int mid = lo + (hi - lo) / 2;

		System.out.println("Is your number less than : " + mid);
		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
		boolean a = x.nextBoolean();

		if (a == true) 
			return guess(lo, mid);
		else                     
			return guess(mid, hi);
	}
	//insertion sort
	public static void sorting(String[] str) 
	{
		String temp;
		int i,j;
		for( i=1;i<=str.length; i++)   
		{  
			temp = str[i];  
			j= i-1;  
			while(j>=0)  
			{  
				if(str[i].compareTo(str[j])>0)
				{
					break;
				} 
				str[j+1] = str[j];   
				j--;  

			} 
			str[j+1] = temp; 
		}
		System.out.println("Sorted strings are...");
		for(i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");

		}
	}
	public static void sort(int n, int[] a) {
		int start=0,end=n-1;
		int mid=(start+end)/2;
		int d=mid+1;
		int temp,j;
		for(int i=0; i<=mid; i++)   
		{  
			temp = a[i];  
			j= i-1;  
			while(j>=0 && temp <= a[j])  
			{  
				a[j+1] = a[j];   
				j--;  
			}  
			a[j+1] = temp;  
		}
		for(int i=d; i<n; i++)   
		{  
			temp = a[i];  
			j= i-1;  
			while(j>=0 && temp <= a[j])  
			{  
				a[j+1] = a[j];   
				j--;  
			}  
			a[j+1] = temp;  
		}		
	}
	public static void printPermution(String str, String ans)
	{

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// i'th character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding the i'th character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermution(ros, ans + ch);
		}
	}
	public static void prime(int start,int end)
	{
		int count;
		//loop for finding and printing all prime numbers between given range
		for(int i = start ; i <= end; i++)
		{
			//logic for checking number is prime or not
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.print(i+" ");
		}
	}
	public static void BalanceParanthesis(String exp)
	{
		Stack s=new Stack();
		char e[]=exp.toCharArray();
		int explen=exp.length();
		int count1=0;int count2=0;
		for(int i=0;i<explen;i++)
		{
			if(e[i]=='(')
			{
				s.push(e[i]);
				count1++;
			}
			else if(e[i]==')')
			{
				s.pop();
				count2++;
			}
		}
		if(count1==count2)
		{
			System.out.println("Expression is valid");
		}
		else
		{
			System.out.println("Expression is invalid");
		}
	}
	public static String inputString()
	{

		try {
			return scanner.next();
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input, try again.");
			return inputString();
		}
	}
	public static String readFromFile(String filename) {

		try {

			bufferReader = new BufferedReader(new FileReader(filename));

		} catch (FileNotFoundException e) {
			System.out.println("Error in Loading Reader" + e.getMessage());
		}

		StringBuilder sb = new StringBuilder();

		try {
			String line;
			while ((line = bufferReader.readLine()) != null) // append until file pointer reaches to null
				sb.append(line);

		} catch (IOException e) {
			System.out.println("File is Empty:  " + e.getMessage());
		} finally {
			try {
				bufferReader.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}

		}

		return sb.toString();

	}
	public static int[] bubbleSort(int[] arr, int arrLength) {
		System.out.println("Before Sorting");
		// prints the array before sorting
		for (int i = 0; i < arrLength; i++)
			System.out.print(arr[i] + " ");

		System.out.println("\nAfter Sorting\n____________________________________\n");
		for (int i = 0; i < arrLength - 1; i++) {
			/**
			 * this loop will execute i-1 times as the last index will be stored in 'i' we
			 * compare 'jth index' with the next index for sorting
			 */
			for (int j = 0; j < arrLength - i - 1; j++) {
				int temp;
				// swap arr[j+1] and arr[i]
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}
		return arr;
	}
	public static boolean isPallindrome(int number) {
		int num = number;
		int pallindrome = 0;
		while (number > 0) {
			int remainder = number % 10;
			pallindrome = pallindrome * 10 + remainder;
			number /= 10;
		}

		if (num == pallindrome)
			return true;
		else
			return false;
	}
	/**************************************
	 * Read From File With return type Array/List
	 **************************************************/

	public static int[] ReadFile(String FileName) {
		File file;
		file = new File(FileName);
		FileReader filereader = null;
		BufferedReader buffer_reader;
		String temp = "";
		String line = "";

		try {
			filereader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		buffer_reader = new BufferedReader(filereader);

		try {
			while ((temp = buffer_reader.readLine()) != null) {
				line += temp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] temp2 = line.split(",");
		int words[] = new int[temp2.length];
		int i = 0;
		for (String s : temp2) {
			words[i++] = Integer.parseInt(s);
		}
		try {
			buffer_reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return words;
	}

	/***********************************
	 * Write In File
	 *****************************************/

	/**
	 * To Write contents in file .
	 * 
	 * @param T String,String fileName
	 * @return void
	 **/
	public static <T> void WriteinFile(T string, String filename) {
		try {

			// Open given file in append mode.
			BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));
			out.write("," + String.valueOf(string));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static boolean isAnagram1(String str1, String str2) {
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		// Sorting Both character Arrays
		Arrays.sort(array1);
		Arrays.sort(array2);

		// if both the arrays are equal after sorting then they are Anagram else not
		if (Arrays.equals(array1, array2)) // condition will check the return value is true or not
			return true;
		else
			return false;

	}
	public static boolean isAnagram(int number1, int number2) {
		int length1 = countDigits(number1);
		int length2 = countDigits(number2);
		if (length1 != length2)
			return false;

		int i = 0;
		int j = 0;
		int[] array1 = new int[length1];
		int[] array2 = new int[length2];
		while (number1 != 0) {
			int rem = number1 % 10;
			array1[i] = rem; // Storing the numbers in reversed order in array1
			number1 = number1 / 10;
			i++;
		}
		while (number2 != 0) {
			int rem = number2 % 10;
			array2[j] = rem; // Storing the numbers in reversed order in array2
			number2 = number2 / 10;
			j++;
		}

		// Sorting both the arrays

		Arrays.sort(array1);
		Arrays.sort(array2);

		if (Arrays.equals(array1, array2)) // Checking if both the arrays are equal
			return true;
		else
			return false;

	}
	// To count number of Digits in a number
	public static int countDigits(int number) {
		// int num =number;
		int count;

		for (count = 0; number != 0;) {
			number = number / 10; // number will be divided with 10 until the result becomes 0
			count++;
		}
		return count;
	}
	/**
	 * Purpose: To check Leap a Year is Leap Year or not
	 * 
	 * @param year --> type integer
	 * @return --> boolean
	 */
	public static boolean isLeapYear(int year) {
		/**
		 * A leap year is exactly divisible by 4 except for century years (years ending
		 * with 00). The century year is a leap year only if it is perfectly divisible
		 * by 400
		 */
		boolean leapYear = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leapYear = true;
			return leapYear;
		}

		else {
			leapYear = false;
			return leapYear;
		}

	}

}
