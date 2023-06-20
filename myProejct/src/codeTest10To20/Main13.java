package codeTest10To20;

import java.util.ArrayList;
import java.util.Arrays;

public class Main13 {
	public static void main(String[] args) {
		Solution13 sol = new Solution13();
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
class Solution13 {
    public int solution(int[] num_list) {
        int num1 = 0;
        int num2 = 0;
    	for(int i=0; i<num_list.length;i++) {
        	num1 = i%2==0? num1+num_list[i] : num1;
        	num2 = i%2!=0? num2+num_list[i] : num2;
        }
    	return num1>num2 ? num1 : num2;
    }
}