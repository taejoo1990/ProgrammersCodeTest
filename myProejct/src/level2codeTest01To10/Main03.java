package level2codeTest01To10;

import java.util.HashMap;

public class Main03 {

	public static void main(String[] args) {
		String aa = "abcde";
		int idx = aa.indexOf("c");
		System.out.println(aa.substring(idx+1));
	}
}class Solution03 {
    public int[] solution(String[] park, String[] routes) {
    	boolean start = false;
    	for(int i=0; i<routes.length; i++) {
    		if(!start) {
    			int startPoint = park[i].indexOf("S");
    			start = startPoint>0 ? true : false;
    			park[i].substring(startPoint);
    			String cnt = routes[i].split(" ")[1];
    		}
    		
    		if(i==routes.length-1) {
    			start = false;
    		}
    	}
    	return null;
    }
}

