package com.euler.project.paul;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Problem1Lambda {

	public static void main(String[] args) {
		
		System.out.println(total(IntStream.rangeClosed(1, 999)
			    .boxed().collect(Collectors.toList()), (n) -> n%3 == 0 || n%5 == 0));

		System.out.println(getMultiples(IntStream.rangeClosed(1, 999)
			    .boxed().collect(Collectors.toList()), (n) -> n%3 == 0 || n%5 == 0));

		System.out.println(IntStream.rangeClosed(1, 999)
			    .boxed().collect(Collectors.toList())
			    .stream().filter(n -> n%3 == 0 || n%5 == 0).collect(Collectors.toList()));
	}
	
	public static List<Integer> getMultiples(List<Integer> nums, Predicate<Integer> predicate) {
		List<Integer> multiples = new ArrayList<Integer>();
		for(Integer n : nums) {
			if(predicate.test(n)) {
				multiples.add(n);
			}
		}
		return multiples;
	}
	
	public static Integer total(List<Integer> nums, Predicate<Integer> predicate) {
		List<Integer> multiples = new ArrayList<Integer>();
		for(Integer n : nums) {
			if(predicate.test(n)) {
				multiples.add(n);
			}
		}
		return multiples.stream().mapToInt(Integer::intValue).sum();
	}
}
