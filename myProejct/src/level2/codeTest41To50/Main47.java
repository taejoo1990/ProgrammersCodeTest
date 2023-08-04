package level2.codeTest41To50;


public class Main47 {
	public static void main(String[] args) {
		Solution47 sol = new Solution47();
	}
}

class Solution47 {
	final char a = 'A'; 
	public int solution(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		String reverseName = sb.reverse().toString();
		int minimumLRMove = getFrontLRCnt(name);
		int minumumUDMove =0;
		int minimumReverseLRMove = reverseName.length()-1;
		for (int i = 0; i < name.length(); i++) {
			int cusor = i+1;
			if (cusor!=name.length()&&name.charAt(cusor) == a) {
				minimumLRMove = getLRCnt(name,i,minimumLRMove);
			} 
			if (cusor!=reverseName.length()&&reverseName.charAt(cusor) == a) {
				minimumReverseLRMove = getLRCnt(reverseName,i,minimumReverseLRMove);
			}
			if(!isA(name.charAt(i))) {
				minumumUDMove += upDown(name.charAt(i));
			}
			minimumLRMove = Math.min(minimumLRMove,minimumReverseLRMove+1);	
		}
		System.out.println("LR  : " + minimumLRMove);
		System.out.println("UD  : " + minumumUDMove);
		return minimumLRMove+minumumUDMove;
	}
		
	
	private int getLRCnt(String str, int index, int minimumLRMove) {
		int aCnt = 0;
		for (int i = index + 1; i < str.length(); i++) {
			if(!isA(str.charAt(i))){
				break;
			}
			aCnt = aCnt+1;	
		}
		minimumLRMove = Math.min(minimumLRMove,index*2+(str.length()-(index+1+aCnt)));
		return minimumLRMove;
	}
	private int getFrontLRCnt(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.replaceAll("A", "").length()==0) {
			return 0;
		}
		if(!isA(str.charAt(str.length()-1))) {

			return str.length()-1;
		}
		String reverseStr = sb.append(str).reverse().toString();
		int aCnt = 0;
		for(char tmp : reverseStr.toCharArray()) {
			if(isA(tmp)) {
				aCnt++;
			}else {
				break;
			}
		}
		return str.length()-aCnt-1;
	}
	
	private boolean isA(char ch) {
		return ch==a;
	}
	private int upDown(char ch) {
		final int startIdx = 65;
		final int endIdx = 91;
		return ch - startIdx < endIdx - ch ? ch - startIdx : endIdx - ch;
	}
}