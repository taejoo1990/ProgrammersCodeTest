package level2.codeTest41To50;

import java.util.Arrays;

public class Main49 {
	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		int[] result = sol.solution(new int[] {2, 2, 2, 2, 2 }, 6);
		System.out.println(Arrays.toString(result));
	}
}

class Solution49 {
	public int[] solution(int[] sequence, int k) {
		int startIdx = 0;
		int endIdx = 1000000;
		// 배열을 돌면서 수열을 만들어나간다.
		for (int i = 0; i < sequence.length; i++) {
			int value = sequence[i];
			if (value > k) {
				continue;
			} else if (value == k) {
				return new int[] { i, i };
			}
			int cusor = i + 1;
			while (cusor < sequence.length) {
				value = value + sequence[cusor];
				if (value > k) {
					break;
				} else if (value == k) {
					if ((cusor - i) < endIdx - startIdx) {
						startIdx = i;
						endIdx = cusor;
						break;
					}
				}
				cusor++;
			}
		}
		return new int[] { startIdx, endIdx };
	}
}