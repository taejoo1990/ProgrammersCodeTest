package level2.codeTest01To10;

import java.util.Arrays;

public class Main08 {
	public static void main(String[] args) {
		Solution08 sol= new Solution08();
		
	}
}

class Solution08 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}