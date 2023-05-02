package cm4structure;

public class Roman {

	public static void main(String[] args) {
		// String romanNumber1 = "XIX";
		String romanNumber = "MCMXCIV";
		int num = getIntegerNumberFromRoman(romanNumber);

		System.out.println("Integer number of " + romanNumber + " is " + num);
		System.out.println("BigO: O(n)");

	}

	public static int defineRomanNumber(char romanNumber) {
		if (romanNumber == 'I') {
			return 1;
		}
		if (romanNumber == 'V') {
			return 5;
		}
		if (romanNumber == 'X') {
			return 10;
		}
		if (romanNumber == 'L') {
			return 50;
		}
		if (romanNumber == 'C') {
			return 100;
		}
		if (romanNumber == 'D') {
			return 500;
		}
		if (romanNumber == 'M') {
			return 1000;
		}

		return -1;

	}

	public static int getIntegerNumberFromRoman(String s) {
		int currentNum = defineRomanNumber(s.charAt(0));
		int result = 0;
		for (int i = 1; i < s.length(); i++) {
			int nextNum = defineRomanNumber(s.charAt(i));
			if (currentNum < nextNum) {
				result -= currentNum;
			} else {
				result += currentNum;
			}
			currentNum = nextNum;
		}
		result += currentNum;
		return result;
	}
}
