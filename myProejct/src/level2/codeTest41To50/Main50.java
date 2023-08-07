package level2.codeTest41To50;

import java.util.Arrays;
import java.util.HashMap;

public class Main50 {
	public static void main(String[] args) {
		Solution50 sol = new Solution50();
		int[] result = sol.solution(new int[] { 1, 1, 1, 1, 1, 1, 1 }, 7);
		System.out.println(Arrays.toString(result));
	}
}

class Solution50 {
	int startIdx = 0;
	int endIdx = 0;
	int sum = 0;
	public int[] solution(int[] sequence, int k) {
		startIdx = 0;
		endIdx = 0;
		sum = sequence[0];
		HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
		while(startIdx<=endIdx) {
			if(sum>k) {
				moveStartIdx(sequence);
			}else if(sum==k) {
				if(!map.containsKey(endIdx-startIdx)) {
					map.put(endIdx-startIdx, new int[] {startIdx,endIdx});
				}
				moveStartIdx(sequence);
			}else {
				if(endIdx==sequence.length-1) {
					moveStartIdx(sequence);
					continue;
				}
				sum += sequence[endIdx+1];
				endIdx++;
			}
		}
		int key = 1000000;
		for(int tmp : map.keySet()) {
			key = tmp<key ? tmp : key;
		}
		return new int[] {map.get(key)[0],map.get(key)[1]};
	}
	private void moveStartIdx(int[] sequence) {
		sum -=  sequence[startIdx];
		startIdx++;
	}

}