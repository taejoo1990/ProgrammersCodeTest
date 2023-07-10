package level2.codeTest21To30;

import java.util.stream.IntStream;

public class Main25 {
	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		System.out.println(sol.solution(13, 17));
		System.out.println(Math.sqrt(9));
	}
}
class Solution25 {
    public int solution(int left, int right) {
        int answer = 0;
    	for(int i=left; i<=right; i++) {
        	int cnt = 1;
    		for(int j=1 ; j<=i/2 ; j++) {
        		if(i%j==0) {
        			cnt++;
        		}
        	}
    		if(cnt%2==0) {
    			answer += i;
    		}else {
    			answer -= i;
    		}
        }
    	return answer;
    }
}