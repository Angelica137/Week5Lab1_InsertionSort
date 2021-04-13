import java.util.Arrays;

class TestInsertionSort {
	public static void main(String[] args) {
		InsertionSort i = new InsertionSort();
		int[] a = { 10, 7, 15, 5 };
		System.out.println(Arrays.toString(i.sort(a)));

	}

}