package level2.codeTest11To20;


public class Main15 {
	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		System.out.println(sol.solution(626331));
			
	}
}
class Solution15 {
    public int solution(int num) {
        int cnt= 0;
        long number = (long)num;
    	while(cnt<500) {
        	if(number!=1) {
        		number = collatzNum(number);
        		cnt++;
        		continue;
        	}
        	System.out.println(cnt);
        	return cnt;
        }
    	return -1;
    }
    private long collatzNum(long num) {
    	return num%2==0?num/2 : num*3+1;
    }
}