package level2.codeTest01To10;

import java.util.Arrays;

public class Main10 {
	public static void main(String[] args) {
		Solution10 sol= new Solution10();
		System.out.println(Arrays.toString(sol.solution(12345)));
		System.out.println(Arrays.toString(sol.solution2(12345)));
	}
}

class Solution10 {
    public int[] solution(long n) {
    	String[] str = String.valueOf(n).split("");
    	int[] answer = new int[str.length];
    	int index = 0;
    	for(int i=str.length-1 ; i>=0;i--) {
    		answer[index] = Integer.parseInt(str[i]);
    		index++;
    	}
    	return answer;
    }
    public int[] solution2(long n) {
    	return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}