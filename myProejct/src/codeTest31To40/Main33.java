package codeTest31To40;

import java.util.ArrayList;

public class Main33 {
	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		sol.solution(new int[] { 0, 1, 1, 2, 2, 3 });
	}
}

/*
 * int�z��arr���p�����[�^�œ`���܂��B �z��̒�����2�̕����ɐL�΂��܂��B �󂢂Ă錳�f�ɂ͂O��ǉ����Ă��������B
 */
class Solution33 {
	public int[] solution(int[] arr) {
		int length = 1;
		while (true) {
			if (length >= arr.length) {
				int[] tmp = arr;
				arr = new int[length];
				for (int i = 0; i < length; i++) {
					if (i < tmp.length) {
						arr[i] = tmp[i];
					} else {
						arr[i] = 0;
					}
				}
				break;
			}
			length = length * 2;
		}
		return arr;
	}
}
