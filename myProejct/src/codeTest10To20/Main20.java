package codeTest10To20;

import java.util.ArrayList;
import java.util.Arrays;

public class Main20 {
	public static void main(String[] args) {
		Solution20 sol = new Solution20();
	}
}

class Solution20 {
    public int[] solution(int[] num_list) {
		/*
		 * int[] answer = new int[num_list.length-5]; Arrays.sort(num_list); for(int i=5
		 * ; i<num_list.length;i++) { answer[i-5] = num_list[i]; }
		 */
    	//return answer;
    	return Arrays.stream(num_list).sorted().skip(5).toArray();
        
    }
}