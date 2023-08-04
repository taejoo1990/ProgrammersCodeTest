package levelTest;

import java.util.HashMap;
import java.util.HashSet;

public class Level7 {
	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		sol.solution("-1 -2 -3 -4");
	}
}

class Solution7 {
	public String solution(String s) {
		String[] numbers = s.split(" ");
		int min = 999999999;
		int max = -999999999;
		for (String tmp : numbers) {
			int number = 0;
			if (tmp.charAt(0) == '-') {
				tmp = tmp.replace("-", "");
				number = Integer.parseInt(tmp) * -1;
			} else {
				number = Integer.parseInt(tmp);
			}
			min = number<min ? number : min;
			max = number>max ? number : max;
		}
		return "" + min +" "+ max;
	}
}
