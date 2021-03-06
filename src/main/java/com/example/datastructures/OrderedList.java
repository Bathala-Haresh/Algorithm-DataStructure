package com.example.datastructures;


/**
 * Created by:Haresh
 * Date: 28-07-2021
 * 
 * 
 * Purpose: Read a List of Numbers from a file and arrange it in ascending Order in a Linked List.
 * 			Take user input for a number, if found then pop the number out of the list else insert
 * 			the number in appropriate position 
 */

import java.io.FileWriter;
import java.io.IOException;

import com.example.utility.InputUtility;
import com.example.utility.LinkedList;
import com.example.utility.Utility;

public class OrderedList 
{

	public static void main(String[] args) throws IOException 
	{
		LinkedList<Integer> list = new LinkedList<>(); // LinkedList Object Created


		System.out.println("Enter a Number to Search: ");
		int number = InputUtility.inputInteger();

		/*
		 * Below is to read the file from the given path. NOTE: File Must have some
		 * value before The execution of Program. if no item found in the list then the
		 * given item will be written to the file but it might cause an exception while
		 * sorting.
		 */

		String path = Utility.readFromFile("O:\\SpringBoot\\OrderedList.txt");
		String [] strArray = path.split(" "); //Splitting spaces from the file and storing in an array
		int size = strArray.length;
		System.out.println(size+" size");
		int []array = new int[size];

		for(int i = 0; i < size; i++)
		{
			array[i] = Integer.parseInt(strArray[i]);	//Reading Each Array from "strArray"
		}

		int [] sorted = Utility.bubbleSort(array, size);	//passing "array & it's size" to BubbleSort in Utility Class 
		for(int num : sorted)
			list.add(num);

		//to write into file

		FileWriter writer = new FileWriter("O:\\SpringBoot\\OrderedList.txt");
		if (list.search(number) == true)
		{
			list.removeItem(number);	//If given number found then remove
		}
		else
		{
			list.add(number);	//if given number not found then add
		}
		list.display();
		int length = list.size();
		System.out.println("length "+length);
		list.display();

		//Writing the list elements into file by popping each elements from the list

		for (int i = 0; i < length; i++) 
		{
			writer.write(list.pop(0) + " ");
		}
		writer.close();
	}

}