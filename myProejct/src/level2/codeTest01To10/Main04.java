package level2.codeTest01To10;

public class Main04 {
	public static void main(String[] args) {
		Solution04 sol = new Solution04();
	}
}
class Solution04{
	public int solution(int n) {
		int answer = 0;
		for(int i=1; i<=n ; i++) {
			answer=n%i==0 ? answer + i: answer;
		}
		return answer;
	}
}
