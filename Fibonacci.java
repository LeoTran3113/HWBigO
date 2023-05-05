package cm4structure;

public class Fibonacci {
	public static void main(String[] args) {

		int number = 15;
		findFibonacci(number);

		System.out.println("Fibonacci number of " + number + " is " + findFibonacci(number));
		System.out.println("-----------------------");
		System.out.println("Time Complexity is O(n)");
	}

	public static int findFibonacci(int num) {
		int pre = 0;
		int current = 1;
		int sum = 0;

		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		while (num > 1) {
			sum = pre + current;
			pre = current;
			current = sum;
			num--;
		}
		return sum;

	}

}
