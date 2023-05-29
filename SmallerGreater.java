package com.test;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.



Input Format

Given only argument A an Array of Integers.
Output Format

Return an Integer X, i.e number of elements.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e6
For Example

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.

 */
public class SmallerGreater {
	public int findElements(ArrayList<Integer> A) {
		int count = 0;
		int N = A.size();

		if (N <= 2) {
			return 0;
		}

		Integer[] arr = new Integer[N];
		A.toArray(arr);
		Arrays.sort(arr);

		for (int i = 1; i < N - 1; i++) {
			if (arr[i] > arr[0] && arr[i] < arr[N - 1]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		SmallerGreater elements = new SmallerGreater();
		System.out.println("Smaller Greater Elements : "+elements.findElements(arrList));
	}
}
