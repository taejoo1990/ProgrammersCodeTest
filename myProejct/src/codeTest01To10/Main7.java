package codeTest01To10;

public class Main7 {
	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		// sol.solution(null,null,null)
		int a = 1;
		Integer ia = 1;
		System.out.println(a);
		System.out.println(ia); // ?��???
		Object ab = new Object();
		Main7 mm = new Main7();
		mm.aa();

	}

	public int aa() {
		return 1;
	}
}

class Solution7 {
	public int[] solution(int[] arr, int[][] intervals) {
		int[] pre = cutIntArr(intervals[0][0], intervals[0][1], arr);
		int[] suf = cutIntArr(intervals[1][0], intervals[1][1], arr);
		return concatArray(pre,suf);
	}

	private int[] concatArray(int[] pre, int[] suf) {
		int[] result = new int[pre.length+suf.length];
		for(int i=0; i<result.length ;i++) {
			if(i<pre.length) {
				result[i]=pre[i];
			}else {
				result[i] = suf[i-pre.length];
				}
			}
		return result;
	}

	private int[] cutIntArr(int startIdx, int endIdx, int[] num_list) {
		int[] result = new int[endIdx - startIdx + 1];
		int index = 0;
		for (int i = startIdx; i <= endIdx; i++) {
			result[index] = num_list[i];
			index++;
		}
		return result;
	}
}