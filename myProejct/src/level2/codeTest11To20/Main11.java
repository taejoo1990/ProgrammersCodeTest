package level2.codeTest11To20;

import java.util.Arrays;
import java.util.HashMap;

public class Main11 {
	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		
	}
}
class Solution11 {
    public long solution(long n) {
        int x = 1;
    	while(true) {
    		long num = (long)Math.pow(x, 2);
    		if(num==n) {
    			return (long)Math.pow(x+1, 2);
    		}else if(num>n) {
    			return -1;
    		}
    		x++;
        }
    }
}