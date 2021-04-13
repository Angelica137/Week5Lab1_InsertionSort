import java.util.Arrays;

class InsertionSort {
	// accepts an array of ints as anrgument and sorts it
	// in ascending order
	public int[] sort(int[] array) {
		// start from the second index since the first index
		// will be default be the smallest when drawn first
		// declare an int to store this index
		int j;
		// iterate through indexes 1 - a.length
		for (j = 1; j < array.length; j++) {
			// we will compare each index with the previous ones
			// to see if they are greater in value
			// store the value of A[j] in a variable so we can keep it
			// and place it corerclty as we sort in place
			int key = array[j];
			// store the previous index in a var i so we can compare
			// A[j] with preceding values A[0.. j - 1]
			int i = j - 1;
			// now we want to iterate through all indeces below j
			// and check their values against key (A[j]). We do it in reverse order
			// from the index closer to j
			while (i >= 0) {
				// insert key in the correct place
				if (array[i] > key) {
					// assign this greater value to the next position i + 1
					array[i + 1] = array[i];
					System.out.println(key);
				}
				i = i - 1;
			}
		}
		return array;

	}

}