package level2.codeTest41To50;


public class Main48 {
	public static void main(String[] args) {
		Solution48 sol = new Solution48();
		sol.solution(10, 20);
	}
}
class Solution48 {
    public long solution(int r1, int r2) {
    	long result = 0;
    	double powR1 = Math.pow(r1,2);
    	double powR2 = Math.pow(r2,2);
    	for(int i=1; i<=r2; i++) {
    		double powI = Math.pow(i,2);
    		long cercleCnt1 = (long)Math.ceil(Math.sqrt(1.0*powR1 - 1.0*powI));
    		long cercleCnt2 = (long)Math.floor(Math.sqrt(1.0*powR2 - 1.0*powI));
    		result += (cercleCnt2-cercleCnt1+1);
    	}
    	return result *4 ;
    }

}