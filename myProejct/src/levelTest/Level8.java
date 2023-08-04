package levelTest;

public class Level8 {
	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		System.out.println(sol.solution(10));
	}
}

class Solution8 {
	public String solution(int n) {
		int num = 0; 
		StringBuilder sb = new StringBuilder();
		while(true) {
			num = n%3;
			n /= 3;
			if(num==0) {
				num=4;
				n -= 1;
			}
			sb.append(num);
			if(n==0) {
				break;
			}
		}
		return sb.reverse().toString();
	}
}
