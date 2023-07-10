package level2.codeTest11To20;

import java.util.Arrays;


public class Main12 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(118372));		
	}
}
class Solution12 {
    public long solution(long n) {
    	int[] numbers = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sorted().toArray();
    	String tmpStr="";
    	for(int i=numbers.length-1; i>=0; i--) {
    		tmpStr+=numbers[i];
    	}
    	return Long.parseLong(tmpStr);
    }
}