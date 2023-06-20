package codeTest10To20;

import java.util.ArrayList;
import java.util.Arrays;

public class Main14 {
	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int[] case1 = { 2, 1, 6 };
		int[] query = { 5, 2, 1, 7, 5 };
		String[] input = { "u", "u", "r", "r" };
		//sol.solution(input);
	}
}

// 0 1 2 
// 13people
// 0 : 0,1,2,3,4
// 1 : 5,6,7,8,9
// 2 : 10 11 12 13 14   15-10 = 5 // 5down 
class Solution14 {
    public String[] solution(String[] names) {
    	int length = names.length%5==0 ?names.length/5 : names.length/5+1; 
        String[] answer = new String[length];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = names[i*5];
        }
        return answer;
    }
}