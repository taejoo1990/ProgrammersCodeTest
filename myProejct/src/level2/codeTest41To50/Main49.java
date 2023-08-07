package level2.codeTest41To50;

import java.util.Arrays;
import java.util.HashMap;

public class Main49 {
	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		int[] result = sol.solution(new int[] { 1,1,1,1,1,1,1}, 7);
		System.out.println(Arrays.toString(result));
	}
}

class Solution49 {
	public int[] solution(int[] sequence, int k) {
		HashMap<Integer, int[]> answers = new HashMap<Integer, int[]>();
		answers = getAnswer(answers, sequence, k, 0, 0, sequence[0]);
		int idx = 1000000;
		for (int tmp : answers.keySet()) {
			idx = tmp < idx ? tmp : idx;
		}
		return new int[] { answers.get(idx)[0], answers.get(idx)[1] };
	}

	private HashMap<Integer, int[]> getAnswer(HashMap<Integer, int[]> map, int[] sequence, int k, int startIdx,
			int endIdx, int sum) {
		if (sum > k) {
			sum -= sequence[startIdx];
			startIdx++;
		} else if (sum == k) {
			if (!map.containsKey(endIdx - startIdx + 1)) {
				map.put(endIdx - startIdx + 1, new int[] { startIdx, endIdx });
			}
			sum -= sequence[startIdx];
			startIdx++;
		} else {
			if (endIdx + 1 == sequence.length) {
				return map;
			}
			sum += sequence[endIdx + 1];
			endIdx++;
		}

		if (startIdx <= endIdx) {
			return getAnswer(map, sequence, k, startIdx, endIdx, sum);
		}
		return map;
	}
}