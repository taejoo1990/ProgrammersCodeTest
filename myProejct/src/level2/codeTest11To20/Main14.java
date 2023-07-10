package level2.codeTest11To20;

import java.util.stream.LongStream;

public class Main14 {
	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		System.out.println(sol.solution(3, 5));
			
	}
}
class Solution14 {
    public long solution(int a, int b) {
    	return b>=a?LongStream.range((long)a, (long)b+1).sum():LongStream.range((long)b, (long)a+1).sum();
    
    }
}