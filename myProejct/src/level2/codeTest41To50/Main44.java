package level2.codeTest41To50;

import java.util.Arrays;


public class Main44 {
	public static void main(String[] args) {
		Solution44 sol = new Solution44();
		sol.solution(new int[][] { { 4, 5 }, { 4, 8 }, { 10, 14 }, { 11, 13 }, { 5, 12 }, { 3, 7 }, { 1, 4 } });
	}
}

class Solution44 {
	public int solution(int[][] targets) {
		Arrays.sort(targets, ((x, y) -> x[0] - y[0]));
		int result = 0;
		int currentStartIdx = targets[0][0];
		int currentEndIdx = targets[0][1];
		for(int target[] : targets) {
			if(result==0) {
				result = result + 1;
				continue;
			}
			
			int thisStartIdx = target[0];
			int thisEndIdx = target[1];
			
			if(currentStartIdx <= thisStartIdx && currentEndIdx > thisStartIdx) {
				currentStartIdx = Math.max(currentStartIdx, thisStartIdx);
				currentEndIdx = Math.min(currentEndIdx, thisEndIdx);
			}else {
				currentStartIdx = thisStartIdx;
				currentEndIdx = thisEndIdx;
				result = result+1;
			}
		}
		return result;
	}

}