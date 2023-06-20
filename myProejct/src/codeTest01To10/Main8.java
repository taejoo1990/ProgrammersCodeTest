package codeTest01To10;

import java.util.ArrayList;

public class Main8 {
	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		int[] case1 = {1, 2, 1, 4, 5, 2, 9};
		sol.solution(case1);
	}
}

class Solution8 {
	public int[] solution(int[] arr) {
		boolean startCopy = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> tmpData = new ArrayList<Integer>();
		for(int tmp : arr) {
			if(startCopy) {
				tmpData.add(tmp);
				if(tmp==2) {
					list.addAll(tmpData);
					tmpData.clear();
				}
			}else {
				if(tmp==2) {
					list.add(tmp);
					startCopy = true;
				}
			}
		}
		int[] answer;
		if(startCopy) {
			answer = list.stream().mapToInt(i -> i).toArray();
		}else {
			answer = new int[1];
			answer[0] = -1;
		}
		return answer;
	}
}