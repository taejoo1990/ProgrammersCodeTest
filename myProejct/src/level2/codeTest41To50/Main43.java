package level2.codeTest41To50;

public class Main43 {
	public static void main(String[] args) {
		Solution43 sol = new Solution43();
	}
}

class Solution43 {
	public String solution(String p) {
		if (isCorrect(p)) {
			return p;
		}
		String[] arr = devideStr(p).split(" ");
		String u = arr[0];
		String v = "";
		if (arr.length > 1) {
			v = arr[1];
		}
		if (isCorrect(u)) {
			System.out.println("u+v = " + u + v);
			return u + solution(v);
		} else {
			String tmp = "(";
			tmp += solution(v);
			tmp += ")";
			u = u.substring(1, u.length() - 1);
			u = u.replace("(", "t");
			u = u.replace(")", "(");
			tmp += u.replace("t", ")");
			System.out.println("tmp = " + tmp);
			return tmp;
		}
	}

	private String devideStr(String str) {
		if (str.isEmpty()) {
			return "";
		}
		char[] charArr = str.toCharArray();
		int openCnt = 0;
		int closeCnt = 0;
		String result = "";
		for (int i = 0; i < charArr.length; i++) {
			if (isOpen(charArr[i])) {
				openCnt += 1;
			} else {
				closeCnt += 1;
			}
			result += charArr[i];
			if (openCnt > 0 && openCnt == closeCnt) {
				result += " " + str.substring(result.length(), str.length());
				break;
			}
		}
		return result;
	}

	public boolean isCorrect(String str) {
		char[] charArr = str.toCharArray();
		if (str.isEmpty()) {
			return true;
		}
		if (charArr[0] == ')') {
			return false;
		} else {
			int openCnt = 1;
			int closeCnt = 0;
			for (int i = 1; i < charArr.length; i++) {
				if (isOpen(charArr[i])) {
					openCnt += 1;
				} else {
					closeCnt += 1;
				}
				if (closeCnt > openCnt) {
					return false;
				}
			}

		}
		return true;
	}

	private boolean isOpen(char ch) {
		return ch == '(';
	}
}
