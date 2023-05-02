package cm4structure;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		arr = sortArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("BigO: O(n)");

	}

	public static int[] sortArray(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				arr[mid] = arr[low];
				arr[low] = 0;
				low++;
				mid++;

			} else if (arr[mid] == 1) {
				mid++;

			} else {
				arr[mid] = arr[high];
				arr[high] = 2;
				high--;
			}
		}
		return arr;
	}
}
