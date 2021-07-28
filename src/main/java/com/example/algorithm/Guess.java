package com.example.algorithm;
import java.lang.Math;

import com.example.utility.*;

public class Guess{
	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
		int n = (int) Math.pow(2, k);
		System.out.println("Think of an integer between  0," + (n-1));
		int secret = Utility.guess(0, n);
		System.out.println("Your number is " + secret);

	}
}