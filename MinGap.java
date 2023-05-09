package cm4structure;



public class MinGap {
	public static void main(String[] args) {
		
		int[] array = { 7, 1, 3, 4, 1, 7 };
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					min = Math.min(min, j - i);

				}

			}

		}

		System.out.println("Min gap is " + min);
	}
}
