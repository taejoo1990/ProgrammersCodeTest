package codeTest10To20;

import java.util.ArrayList;

public class Main18 {
	public static void main(String[] args) {
		Solution18 sol = new Solution18();
		int[] case1 = {12, 4, 15, 1, 14};
		int a = sol.solution(case1);
		System.out.println(a);
	}
}

class Solution18 {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int tmp : num_list) {
        	while(true) {
        		if(tmp==1) {
        			break;
        		}
        		answer ++;
        		tmp = tmp%2 ==0 ? tmp/2 : (tmp-1)/2;	
        	}
        }
        return answer;
    }
}