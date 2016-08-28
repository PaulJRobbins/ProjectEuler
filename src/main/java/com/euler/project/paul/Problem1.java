package com.euler.project.paul;

import java.util.ArrayList;
import java.util.List;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Problem1 {

	public static void main(String[] args) {
		
		int total = 0;
		List<Integer> multiples = new ArrayList<Integer>();

		for(int i = 0; i<1000; i++) {
			if(i%3 == 0 || i%5 == 0) {
				multiples.add(i);
				total += i;
			}
		}
		
		System.out.println("Integer multiples of 3 or 5: "+multiples);
		System.out.println("Total: "+total);
	}
}
