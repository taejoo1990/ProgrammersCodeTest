package level1.codeTest20To30;

public class Main22 {
	public static void main(String[] args) {
		Solution22 sol = new Solution22();
	}
}

/*
 * -Description 
 * 文字列パラメータmyStringとpatがあります。
 * myStringの元素の中でPatを含めて終わる最長の文字列をリターンするメソッド
 * 
 * -制限 myStringは必ずpatを含めています。 myStringは大文字と小文字を区分します。
 */

class Solution22 {
	public String solution(String myString, String pat) {
		return myString.substring(0, myString.lastIndexOf(pat)+pat.length());
	}
}
