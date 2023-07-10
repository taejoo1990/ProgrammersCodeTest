package level2.codeTest21To30;

import java.util.Arrays;
import java.util.Collections;

public class Main26 {
	public static void main(String[] args) {
		Solution26 sol = new Solution26();
		sol.solution("Zbcdefg");
		System.out.println((char)65);
	}
}
class Solution26 {
    public String solution(String s) {
    	Character[] arr =  new Character[s.length()];
    	for(int i=0; i<s.length();i++) {
    		arr[i] = s.charAt(i);
    	}
    	Arrays.sort(arr,Collections.reverseOrder());
    	String answer = "";
    	for(int i=0; i<s.length();i++) {
    		answer +=arr[i];
    	}
    	System.out.println(answer);
    	return answer;
    }
}