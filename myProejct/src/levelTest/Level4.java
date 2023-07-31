package levelTest;

public class Level4 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(Integer.toBinaryString(1111));
		sol.solution("110010101001");
	}
}

class Solution4 {
	public int[] solution(String s) {
        int changeCnt = 0;
		int removeCnt = 0;
    	while(true) {	
		int lengthBefore = s.length();
        s= s.replaceAll("0", "");
        int lnegthAfter = s.length();
        removeCnt += lengthBefore-lnegthAfter;
    	s = Integer.toBinaryString(s.length());
    	changeCnt++;
    	if(s.equals("1")) {
    		break;
    	}
    	}
        int[] answer = new int[] {changeCnt,removeCnt};
        return answer;
    }
    
   
}
