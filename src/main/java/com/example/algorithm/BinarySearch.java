/**
 * @author Bathala Haresh
 * @since 28-july-2021
 * @version 1.0
 * 
 * Purpose:program to find a string using binary search
 */
package com.example.algorithm;
import com.example.utility.*;

public class BinarySearch {
	// Driver method to test above
	public static void main(String []args)
	{
		String[] arr = { "abc", "def", "ghi", "jkl"};
		String key = "abc";
		int result=Utility.binarySearch(arr, key);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found");

	}
}