import java.util.Arrays;

class InsertionSort {
	// problem 1. ascending sort
	// accepts an array of ints as anrgument and sorts it
	// in ascending order
	public int[] sortIncreasing(int[] array) {
		// start from the second index since the first index
		// will by default be the smallest when drawn first
		// declare an int to store this index
		// iterate through indexes 1 - a.length
		for (int j = 1; j < array.length; j++) {
			// we will compare each index with the previous ones a[j - 1]
			// to see if they are greater in value
			// store the value of A[j] in a variable so we can keep it
			// and place it corerclty as we sort in place
			int key = array[j];
			// store the previous index in a var i so we can compare
			// A[j] with preceding values A[0.. j - 1]
			int i = j - 1;
			// now we want to iterate through all indeces below j
			// and check their values against key (A[j]). We do it in reverse order
			// from the index closer to j, j -1.
			while (i >= 0 && array[i] > key) {
				// assign this greater value to the next position i + 1
				array[i + 1] = array[i];
				i = i - 1;
			}
			// place the value stored in key at position a[i + 1]
			array[i + 1] = key;
		}

		return array;

	}

	// problem 2.
	// sortReverse uses an insertion sort aglorithm to sort an array
	public int[] sortReverse(int[] array) {
		// the first item in the array is the largest at thapt point
		// coz it is the only one we have looked at
		// so we move on to the second item index 1
		// from index 1 and up to the last index, pick each one and
		// compare it with the items you have already sorted and see
		// where they belong
		for (int i = 1; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}

}