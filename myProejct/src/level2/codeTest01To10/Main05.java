package level2.codeTest01To10;

import java.util.Arrays;

public class Main05 {
	public static void main(String[] args) {
		Solution05 sol = new Solution05();
		System.out.println(sol.solution(123));
	}
}

/*
 * Description
 * Given a natural number N as the parameter, 
 * write a function solution to return the sum of each digit of N.
 * For example, if N = 123, return 1 + 2 + 3 = 6.
*/
class Solution05 {
    public int solution(int n) {
    	return Arrays.stream(Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray()).reduce((x,y)->x+y).getAsInt();
    }
}