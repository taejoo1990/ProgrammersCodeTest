package level1.codeTest10To20;

import java.util.ArrayList;
import java.util.Arrays;

public class Main12 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] case1 = { 2, 1, 6 };
		int[] query = { 5, 2, 1, 7, 5 };
		String[] input = { "u", "u", "r", "r" };
		//sol.solution(input);
	}
}

// 123
// 1 ->  2-> 3-> 
class Solution12 {
    public int[] solution(int[] num_list, int n) {
    	int length = num_list.length%n == 0?num_list.length/n : num_list.length/n+1; 
    	int[] answer = new int[length];
        for(int i=0 ;i<num_list.length; i+=n) {
        	answer[i/n] = num_list[i];
        }
        return answer;
    }
}