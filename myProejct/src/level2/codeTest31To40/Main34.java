package level2.codeTest31To40;

import java.util.*;

public class Main34 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		System.out.println();
		System.out.println((int) 'A');
	}
}

class Solution34 {
	public String solution(String s) {
		boolean isOdd = false;
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				isOdd = false;
				result += s.charAt(i);
				continue;
			}
			String tmp = String.valueOf(s.charAt(i));
			result += isOdd ? tmp.toLowerCase() : tmp.toUpperCase();
			isOdd = !isOdd;
		}
		return result;
	}
}
