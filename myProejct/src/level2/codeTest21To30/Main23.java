package level2.codeTest21To30;


public class Main23 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		System.out.println(Math.round((double)3/2));
	}
}
class Solution23 {
    public String solution(int n) {
        String answer = "";
    	for(int i=0; i<n ; i++) {
        	answer += i%2 == 0 ? "수": "박";
        }
    	return answer;
    }
}