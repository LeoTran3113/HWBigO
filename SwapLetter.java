package cm4structure;

public class SwapLetter {
	public static void main(String[] args) {
		String str1 = "baaaaa";
		String str2 = "baaabbaabbb";
		String str3 = "baabab";

		int move1 = countMove(str1);
		int move2 = countMove(str2);
		int move3 = countMove(str3);

		String newStr1 = adjustLetter(str1, move1);
		String newStr2 = adjustLetter(str2, move2);
		String newStr3 = adjustLetter(str2, move3);

		System.out.println("String: " + str1 + " with " + move1 + " moves " + " AND adjusted string " + newStr1);
		System.out.println("");
		System.out.println("String: " + str2 + " with " + move2 + " moves " + " AND adjusted string " + newStr2);
		System.out.println("");
		System.out.println("String: " + str3 + " with " + move3 + " moves " + " AND adjusted string " + newStr3);
	}

	public static int countMove(String S) {
		int count = 0;
		char[] chars = S.toCharArray();

		for (int i = 0; i < chars.length - 2; i++) {
			if (chars[i] == chars[i + 1] && chars[i] == chars[i + 2]) {
				count++;

			}
		}

		return count;
	}

	public static String adjustLetter(String S, int count) {
		char[] chars = S.toCharArray();

		for (int i = 0; i < chars.length - 2; i++) {
			if (chars[i] == chars[i + 1] && chars[i] == chars[i + 2]) {
				chars[i + 2] = chars[i] == 'a' ? 'b' : 'a';
			}
		}

		return new String(chars);
	}

}