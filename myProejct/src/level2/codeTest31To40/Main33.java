package level2.codeTest31To40;

import java.util.*;

public class Main33 {
	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		sol.solution(125);
	}
}
// 125 - 125/3 41/2
// 41 - 41/3 13/2
// 13 - 13/3 4/1
// 4  - 4/3 1/1
// 1  - 1/3
class Solution33 {
    public int solution(int n) {
    	String revTh = "";
    	while(true) {
    		if(n<3) {
    			revTh += String.valueOf(n);
    			break;
    		}
    			revTh += String.valueOf(n%3);
    			n=n/3;
        }
    	return Integer.parseInt(revTh,3);
    }
}
