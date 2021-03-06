package com.example.datastructures;



import com.example.utility.HashingFunction;
import com.example.utility.InputUtility;
import com.example.utility.Utility;
/**
 * @author Haresh
 * @since 28-july-2021
 * @version 1.0
 * 
 * Purpos:To create hashing table to data based on hashcode using singly linkedlist.
 * suppose we want to store data 26.
 * 26%11=4 it will store data on 4th location
 * 44%11=4 it also store on 4th location
 * 22%11=2
 * 33%11=3
 * finally
 * 				(2)->22
 * 				(3)->33
 * 				(4)->44,26
 */

public class Hashing 
{
	static int size;
	static HashingFunction hashing=new HashingFunction();
	
	static String filename="O:\\SpringBoot\\hashing.txt";
	
	public static void main(String[] args)
	{
		int[] list=Utility.ReadFile(filename);
		
		for(int index:list)
		{
			System.out.println("List :" +index);
			hashing.put(index);
		}
		
		System.out.println("Enter the Number you want to search");
		int search=InputUtility.inputInteger();
		SearchElement(search);
	}
	
	/** it will Search the element in LinkedList on given location.
	 * @param int value
	 * @return void  
	 * **/	
	public static void SearchElement(int element)
	{
		boolean result=hashing.search(element);
		if(result)
		{
			System.out.println(element+" Element is found and removed successfully");
			hashing.removeElement(element);
			
		}
		else
		{
			System.out.println("Element not found and added to file");
			Utility.WriteinFile(element, filename);
		}
	}
}