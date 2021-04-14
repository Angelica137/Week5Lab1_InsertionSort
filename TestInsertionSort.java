import java.util.Arrays;

class TestInsertionSort {
	public static void main(String[] args) {
		InsertionSort i = new InsertionSort();
		int[] a = { 10, 7, 15, 5 };
		// test ascending order sort
		System.out.println(Arrays.toString(i.sortIncreasing(a)));

		System.out.println(Arrays.toString(i.sortReverse(a)));

	}

}