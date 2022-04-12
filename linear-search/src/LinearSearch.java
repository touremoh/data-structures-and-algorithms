import java.util.logging.Logger;

/**
 * Linear Search Algorithm in Java
 */
public class LinearSearch {

	static Logger log = Logger.getLogger(LinearSearch.class.getName());

	public static void main(String[] args) {
		var uTarget = -10;
		var uArray = new int[]{5, 8, 9, 10, 19, -8};
		var uRes = findIndexInUnsorted(uArray, uTarget);
		var uMessage = uRes == -1 ? "NOT FOUND" : "Index of "+uTarget+" = "+uRes;
		log.info (uMessage);

		var sTarget = 3;
		var sArray = new int[]{1, 8, 9, 11, 15, 19};
		var sRes = findIndexInSorted(sArray, sTarget);
		var sMessage = sRes == -1 ? "NOT FOUND" : "Index of "+sTarget+" = "+sRes;
		log.info(sMessage);
	}

	// find index of value in an unsorted array
	public static int findIndexInUnsorted(int[] array, int target) {
		for (int counter=0; counter < array.length; counter++) {
			if (target == array[counter]) {
				return counter;
			}
		}
		return -1;
	}
	// find index of value in a sorted array
	public static int findIndexInSorted(int[] array, int target) {
		int counter = 0;

		while (counter < array.length && target > array[counter]) {
			counter++;
		}

		if (counter < array.length && target == array[counter]) {
			return counter;
		}
		return -1;
	}
}
