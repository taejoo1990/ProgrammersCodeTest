package level2.codeTest41To50;


public class Main42 {
	public static void main(String[] args) {
		Solution42 sol = new Solution42();
	}
}

class Solution42 {
    public int solution(int n, int m, int[] section) {
    	int cusor = 0;
    	int answer = 0;
    	for(int i : section) {
    		if(i > cusor) {
    			cusor = i+m-1;
    			answer ++;
    		}
    	}
        return answer;
    }
}
