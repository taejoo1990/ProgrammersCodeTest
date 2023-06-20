package codeTest01To10;

public class Main5 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String case1 = "(()())()";
		String case2 = ")(";
		String case3 = "()))((()";
		solution.solution(case1);
	
    }
}
class Solution{
	public String solution(String p) {
		String[] strArr = devideStr(p);
		String u = strArr[0];
		String v = strArr[1];
		u = modifyStr(u);
		v = v.equals("") ? v  : modifyStr(v);
		System.out.println(u+v);
		return u+v;
	}
	private String[] devideStr(String str) {
		String[] result = new String[2];
		int openCnt = 0;
		int closeCnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') {
				openCnt ++;
			}else {
				closeCnt++;
			}
			if(openCnt>0 && closeCnt>0 && openCnt==closeCnt) {
				result[0]=str.substring(0,i+1);
				result[1]=str.substring(i+1);
				return result;
			}
		}
		return result;
	}
	private boolean isCorrectStr(String str) {
		int score = 0;
		for(char tmp : str.toCharArray()) {
			score = tmp=='('? score+1 : score-1;
			if(score<0) {
				return false;
			}
		}
		return score==0 ? true : false;
	}
	private String modifyStr(String str) {
		if(isCorrectStr(str)) {
			return str;
		}
		return "()()";
	}
	
}
