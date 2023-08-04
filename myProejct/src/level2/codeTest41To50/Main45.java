package level2.codeTest41To50;

import java.util.Arrays;

public class Main45 {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		sol.solution(new int[][] { { 4, 5 }, { 4, 8 }, { 10, 14 }, { 11, 13 }, { 5, 12 }, { 3, 7 }, { 1, 4 } });
	}
}

class Solution45 {
	public int solution(int[][] targets) {
		int answer = 0;

		Arrays.sort(targets, ((x, y) -> x[0] - y[0]));

		int preStart = targets[0][0];
		int preEnd = targets[0][1];

		for (int[] target : targets) {
			if (answer == 0) {
				answer += 1;
				continue;
			}

			int curStart = target[0];
			int curEnd = target[1];

			if (preStart <= curStart && curStart < preEnd) {
				preStart = Math.max(preStart, curStart);
				preEnd = Math.min(preEnd, curEnd);
			} else {
				preStart = curStart;
				preEnd = curEnd;
				answer += 1;
			}
		}
		System.out.println(answer);
		return answer;
	}

}