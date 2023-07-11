package level2.codeTest31To40;

import java.util.*;

public class Main36 {
	public static void main(String[] args) {
		Solution36 sol = new Solution36();
	}
}


class Solution36 {
    public int solution(int[] d, int budget) {
       Arrays.sort(d);
       int spended = 0;
       int supDep = 0;
       for(int tmp : d) {
    	   if(spended + tmp>budget) {
    		   break;
    	   }
    	   spended += tmp ;
    	   supDep ++;
       }
       return supDep; 
    }
}
