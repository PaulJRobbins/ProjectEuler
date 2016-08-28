package com.euler.project.paul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.robbins.paul.utils.JavaUtils;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Problem1Advanced {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Low: ");
		int low = scan.nextInt();
		System.out.println("High: ");
		int high = scan.nextInt();
		
		System.out.println("Multiples: ");
		List<Integer> multiples = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			int next = scan.nextInt();
			if(next == -1) {
				break;
			}
			multiples.add(next);
		}

		scan.close();
		
		List<Integer> range = IntStream.rangeClosed(low, high).boxed().collect(Collectors.toList());
		List<Integer> matchingMultiples = JavaUtils.getMultiplesInList(range, JavaUtils.intListToArray(multiples));
		System.out.println(matchingMultiples);
		System.out.println(JavaUtils.total(matchingMultiples));
	}
}
