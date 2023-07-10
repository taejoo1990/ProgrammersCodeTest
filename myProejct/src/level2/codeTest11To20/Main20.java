package level2.codeTest11To20;

import java.util.Arrays;

public class Main20 {
	public static void main(String[] args) {
		Solution20 sol = new Solution20();		

	}
}
class Solution20 {
    public int solution(int[] numbers) {
    	final int sum = 45;
    	return sum-Arrays.stream(numbers).sum();
    }
}