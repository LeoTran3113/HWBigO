package cm4structure;

public class SquareRoot {
	public static void main(String[] args) {
		double x = 9;
		System.out.println("Square root of number " + x + " is " + squareRoot(x));
		System.out.println("BigO: O(n)");
	}

	public static double squareRoot(double num) {

		double temp;
		double squareRootNumber = num / 2;

		if (num < 0) {
			System.out.println("Number has to be positive to get square root");

			return 0;
		} else if (num == 0) {
			return 0;
		} else {
			do {
				temp = squareRootNumber;
				squareRootNumber = (temp + (num / temp)) / 2;
			} while ((temp - squareRootNumber) != 0);
			return squareRootNumber;
		}

	}
}
