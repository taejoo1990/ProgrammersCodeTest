package codeTest01To10;

import java.util.Arrays;

public class Main10 {
	public static void main(String[] args) {
		Solution10 sol = new Solution10();
	}
}
// 123
// 1 ->  2-> 3-> 
class Solution10 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        for(int i=n ; i<num_list.length+n ; i++) {
        	if(i>=num_list.length) {
        		answer[i-n] += num_list[index];
        		index ++;
        		continue;
        	}
        	answer[i-n] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}