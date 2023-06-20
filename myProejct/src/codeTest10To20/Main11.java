package codeTest10To20;

import java.util.ArrayList;
import java.util.Arrays;

public class Main11 {
	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		int[] case1 = { 2, 1, 6 };
		int[] query = { 5, 2, 1, 7, 5 };
		String[] input = { "u", "u", "r", "r" };
		sol.solution(input);
	}
}

// 123
// 1 ->  2-> 3-> 
class Solution11 {
	public String[] solution(String[] str_list) {
		ArrayList<String> list = new ArrayList<String>();
		String[] answer = {};
		boolean isNull = true;
		for (String tmp : str_list) {
			if (isNull) {
				if (tmp.equals("l")) {
					isNull = false;
					break;
				} else if (tmp.equals("r")) {
					isNull = false;
					list.clear();
					continue;
				}
			}
			list.add(tmp);
		}
		if (!isNull) {
			answer = list.toArray(new String[list.size()]);
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}