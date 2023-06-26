package level1.codeTest41To50;

import java.util.ArrayList;

public class Main40 {
	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		String result = sol.solution(new String[] { "abc", "bbc", "cbc" }, "c");
		System.out.println(result);
	}
}

/*
 * パラメータexを含めてないString配列の元素をリターン
 */
class Solution40 {
	public String solution(String[] str_list, String ex) {
		String answer = "";
		for (String tmp : str_list) {
			if (!tmp.contains(ex)) {
				answer += tmp;
			}
		}
		return answer;
	}
}
