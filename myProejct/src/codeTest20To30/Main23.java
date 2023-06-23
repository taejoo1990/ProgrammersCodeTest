package codeTest20To30;

public class Main23 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
	}
}

/*
 * -Description 文字列パラメータmyStringとpatがあります。 myStringでpatの登場数をリターンするメソッド
 * 
 * -制限 -
 */

class Solution23 {
	public int solution(String myString, String pat) {
		int answer = 0;
		// patが文字列でループを使います。
		// StreamやReplaceでは重なる場合を数えません。
		for (int i = 0; i < myString.length(); i++) {
			if (myString.length() - i >= pat.length() && myString.charAt(i) == pat.charAt(0)) {
				answer++;
				for (int j = 1; j < pat.length(); j++) {
					if (myString.charAt(i + j) != pat.charAt(j)) {
						answer--;
						break;
					}
				}
			}
		}
		return answer;
	}
}
