package level2.codeTest21To30;

import java.util.stream.IntStream;

public class Main24 {
	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		System.out.println(sol.solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2}));
		System.out.println(sol.solution2(new int[] {1,2,3,4}, new int[] {-3,-1,0,2}));
	}
}
class Solution24 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length;i++) {
        	answer += a[i]*b[i];
        }
        return answer;
    }
    public int solution2(int[] a, int[] b) {
    	return IntStream.range(0, a.length).map(i->a[i]*b[i]).sum();
    }
}