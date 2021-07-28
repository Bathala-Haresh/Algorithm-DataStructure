package com.example.utility;
public class HashingFunction 
{
	@SuppressWarnings("rawtypes")
	static LinkedListForHashing [] linklist=new LinkedListForHashing[11];
	static String filename="O:\\SpringBoot\\hashing.txt";
	
	/** 
	 * it will generates the linlList Object as per size of stack here we have taken 10.
	 * @param no param
	 * @constructor  
	 * 
	 */	
	@SuppressWarnings("rawtypes")
	public HashingFunction()
	{
		for(int index=0; index < 11; index++)
		{
			linklist[index]=new LinkedListForHashing();
		}
	}

	/** it will put the element in LinkedList on given location.
	 * @param int value
	 * @return void  
	 * **/	
	@SuppressWarnings("unchecked")
	public void put(int value)
	{
		linklist[value%11].add(value);	
	}

	/** it will Search the element in LinkedList on given location.
	 * @param int value
	 * @return boolean  
	 * **/	
	static int index; 
	@SuppressWarnings("unchecked")
	public boolean search(int value)
	{
		boolean result=false;
		try 
		{
			result=linklist[value%11].searchNode(value);
			System.out.println(result);
			index=LinkedListForHashing.getindex();
			System.out.println(index);
		}
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/** it will Remove the element from LinkedList on given location.
	 * @param int value
	 * @return void  
	 * **/	
	@SuppressWarnings("unchecked")
	public void removeElement(int data)
	{
		linklist[index].removeNode(data);
		for(int i=0;i<linklist.length;i++)
		{
			
		}
	}
}