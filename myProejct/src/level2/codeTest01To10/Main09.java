package level2.codeTest01To10;

import java.util.Arrays;

public class Main09 {
	public static void main(String[] args) {
		Solution09 sol= new Solution09();
		
	}
}

class Solution09 {
    boolean solution(String s) {
//        int pCnt = 0;
//        int yCnt = 0;
//        String lowStr = s.toLowerCase();
//        for(char tmp : lowStr.toCharArray()) {
//        	pCnt = tmp=='p' ? pCnt+1 : pCnt;
//        	yCnt = tmp=='y' ? yCnt+1 : yCnt;
//        }
//        return pCnt==yCnt;
    	return s.toLowerCase().chars().filter(e-> 'p'==e).count() ==s.toLowerCase().chars().filter(e->'y'==e).count(); 
    }
}