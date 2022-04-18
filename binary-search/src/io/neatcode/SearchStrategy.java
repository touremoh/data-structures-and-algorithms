package io.neatcode;

@FunctionalInterface
public interface SearchStrategy {
	int search(int[] array, int target);
}
