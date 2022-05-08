package io.neatcode.skippingwork;


import io.neatcode.StdOut;

public class Solution {
	public static void main(String[] args) {
		var x = new int[]{13, 5, 6, 2, 5};
		var y = new int[]{5, 2, 5, 13};

		StdOut.info("Results: " + solution(x, y));
	}

	public static int solution(int[] x, int[] y) {
		if (x.length < y.length)
			return solution(y, x);

		for (int id : x) {
			if (search(y, id) == -1)
				return id;
		}
		return -10000;
	}

	public static int search(int[] a, int target) {
		for (int i=0; i < a.length; i++) {
			if (a[i] == target)
				return i;
		}
		return -1;
	}
}
