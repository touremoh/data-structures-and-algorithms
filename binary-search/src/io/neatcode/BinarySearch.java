package io.neatcode;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		var array = new int[] {7, 9, 10, 90, 99, 101};
		var target = 92;

		var res1 = loop.search(array, target);
		var res2 = recursion.search(array, target);

		StdOut.info("Loop Search: " + res1);
		StdOut.info("Recursion Search: " + res2);
	}

	static SearchStrategy loop = (array, target) -> {
		// Sort array
		Arrays.sort(array);

		// initialization
		int lo = 0;
		int hi = array.length - 1;

		// find target value
		while (lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if (target == array[mid])
				return mid;
			else if (target > array[mid])
				lo = mid + 1;
			else
				hi = mid - 1;
		}
		// target not found
		return -1;
	};

	static SearchStrategy recursion = (array, target) -> indexOf(array, target, 0, array.length-1);

	static int indexOf(int[] array, int target, int lo, int hi) {
		if (lo <= hi) {
			int mid = hi - (hi - lo) / 2;
			if (target == array[mid])
				return mid;
			else if (target > array[mid])
				return indexOf(array, target, mid + 1, hi);
			else
				return indexOf(array, target, lo, mid - 1);
		}
		return -1;
	}
}
