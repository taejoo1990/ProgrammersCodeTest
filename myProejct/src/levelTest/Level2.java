package levelTest;

public class Level2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();

		
		String a = "JCCCAAAAAABN";
		sol.solution(a);
	}
}

class Solution2 {
    public int solution(String name) {
    	int minCnt = 0;
    	boolean counting = false;
    	int indexA = 0;
    	int cnt1 = 0;
    	int cnt2 = 0;
    	for(int i=0; i<name.length(); i++) {
    		minCnt +=calMin(name.charAt(i));
    		if(counting) {
    			if(name.charAt(i)!='A') {
    				cnt2 = cnt1>cnt2? cnt1 : cnt2;
    				cnt1 = 0; 
    				counting = false;
    			}
    		}
    		if(name.charAt(i)=='A') {
    			cnt1 ++;
    			indexA = !counting?  i : indexA;
    			counting=true;
    		}
    	}
    	int right = name.length()-1;
    	int left = name.length()-cnt2-1;
    	int a = name.lastIndexOf("A");
    	int length = name.length() ;
    	int dd = indexA*2 + length-a-1;
	    	if(right>left) {
	    		if(dd<left) {
	    			minCnt += dd;
	    		}else {
	    			minCnt +=left;
	    		}	
	    	}else {
	    		if(dd<right) {
	    			minCnt += dd;
	    		}else {
	    			minCnt +=right;
	    		}	
	    	}
    	return minCnt;
    }
    private int calMin(char ch) {
    	int order = (int)ch-65;
    	int reverse = 90-(int)ch+1;
    	return order < reverse ? order : reverse;
    }
}