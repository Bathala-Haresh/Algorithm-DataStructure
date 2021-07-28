package com.example.datastructures;
import com.example.utility.Dequeue;
import com.example.utility.InputUtility;
/**
 * @Author   :  Haresh
 * @Version  :  1.0
 * @Date     : 28/07/2021
 * Purpose   :  A pallindrome is a string that reads the same forward and backward, for example:
  				radar, toot, and madam using Dequeue data type. We would like to construct an 
  				algorithm to input a string of characters and check whether it is a pallindrome.
 */
public class PalindromChecker 
{	
	public static boolean checkPallindrome(String str2) 
	{
		Dequeue<Character> dequeue = new Dequeue<>();	// creating an object of Dequeue class

		for (int i = 0; i < str2.length(); i++) 
		{
			char ch = str2.charAt(i);
			dequeue.addFront(ch);
		}
		
		String reverse = "";
		
		for (int i = 0; i < str2.length(); i++)
		{
			reverse = reverse + dequeue.removeFront();
			
		}

		if (reverse.equals(str2)) 
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{

		System.out.println("Enter a String : ");
		String str = InputUtility.inputStringLine();
		
		if(PalindromChecker.checkPallindrome(str))
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");

	}
	
	
}