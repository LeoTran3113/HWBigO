package cm4structure;

import java.util.Arrays;

public class Prefix {
	public static void main(String[] args) {

		String[] strsA = { "dog", "racecar", "car" };

		Arrays.sort(strsA);

		System.out.println("strsA[0] = " + strsA[0]);
		System.out.println("strsA[1] = " + strsA[1]);
		System.out.println("strsA[2] = " + strsA[2]);

		String prefix = "";

		for (int i = 0; i < strsA[0].length(); i++) {
			if (strsA[0].charAt(i) != strsA[(strsA.length - 1)].charAt(i)) {
				break;
			}

			else
				prefix += strsA[(strsA.length - 1)].charAt(i);
		}
		System.out.println("Longest common prefix is: " + prefix);
	}
}