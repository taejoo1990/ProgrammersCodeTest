package level2.codeTest31To40;

public class Main39 {
	public static void main(String[] args) {
		Solution39 sol = new Solution39();
		System.out.println('a' + 25);
	}
}

class Solution39 {
	public String solution(String s, int n) {
		String answer = "";
		n = n > 25 ? n - 26 : n;
		for (char tmp : s.toCharArray()) {
			int expect = tmp+n;
			if (Character.isLowerCase(tmp)) {
				tmp= expect>(int)'z'? (char)((int)'a'+(expect-(int)'z')-1) : (char)expect;
			} else if (Character.isUpperCase(tmp)) {
				tmp= expect>(int)'Z'? (char)((int)'A'+(expect-(int)'Z')-1) : (char)expect;
			}
			answer += tmp;
		}
		return answer;
	}
}
