package level2.codeTest01To10;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Main07 {
	public static void main(String[] args) {
		Solution07 sol= new Solution07();
		
	}
}

class Solution07 {
    public long[] solution(int x, int n) {
//    	long[] answer = new long[n];
//    	for(long i=0; i<n ; i++) {
//    		answer[(int)i] = x + (i*x);
//    	}
//    	return answer;
    	return LongStream.iterate(x, i->i+x).limit(n).toArray();
    }
}