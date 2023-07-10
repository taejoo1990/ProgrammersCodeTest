package level2.codeTest11To20;

import java.util.Arrays;

public class Main17 {
	public static void main(String[] args) {
		Solution17 sol = new Solution17();		
			
	}
}
class Solution17 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
    	for(int i=0; i<absolutes.length; i++) {
        	answer += calAb(absolutes[i], signs[i]);
        }
    	return answer;
    }
    private int calAb(int absolute, boolean sign) {
    	return sign ? absolute : absolute*-1; 
    }
}