package codeTest10To20;

import java.util.ArrayList;

public class Main17 {
	public static void main(String[] args) {
		Solution17 sol = new Solution17();
	}
}

class Solution17 {
	public int solution(int[] arr) {
		int answer = 0;
		while (true) {
			boolean startSet = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] = arr[i] / 2;
					startSet = true;
				} else if (arr[i] < 50 && arr[i] % 2 != 0) {
					arr[i] = arr[i] * 2 + 1;
					startSet = true;
				}
			}
			if (!startSet) {
				break;
			}
			answer ++;
		}
		return answer;
	}
}