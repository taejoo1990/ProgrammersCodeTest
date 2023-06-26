package level1.codeTest41To50;

import java.util.ArrayList;

public class Main41 {
	public static void main(String[] args) {
		Solution41 sol = new Solution41();
		System.out.println((int)'l');
	}
}

/*
 * 
 */
class Solution41 {
    public String solution(String myString) {
    	String answer = "";
    	for(char tmp : myString.toCharArray()) {
    		answer += ((int)tmp-108)<0? "l" : tmp;
    	}
    	//myString.replaceAll("[^l-z]", "l");
    	return answer;
    }
}
