/**
 * @author Bathala Haresh
 * @since 28-july-2021
 * @version 1.0
 * 
 * Purpose:program to take an arithmetic expression and check it is in balanced peranthsis or not
 */
package com.example.datastructures;
import com.example.utility.Utility;

public class BalanceParanthasis
{

	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the Expression:");
		String exp=Utility.inputString();
		Utility.BalanceParanthesis(exp);		
	}
}