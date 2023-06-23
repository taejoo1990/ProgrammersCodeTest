package codeTest20To30;

import java.util.ArrayList;

public class Main30 {
	public static void main(String[] args) {
		Solution30 sol = new Solution30();
		int[] intArr = {3,2,4,1,3};
		boolean[] boolArr = {true,false,true,false,false};
		sol.solution(intArr, boolArr);
		System.out.println();
	}
}

/*
 * -Description 
 * int�z��arr��boolean�z��flag���p�����[�^�œ`���܂��B
 * �󂢂Ă�z��𐶐����Aflag[i]��true�̏ꍇ�Aarr[i]��arr[i]��ǉ������āA
 * false�̏ꍇ�z��̍Ō�̌��f���폜�����Ƃ�arr[i]�񃋁[�v���Č��ʂ����^�[��
 * 
 * ����
 */

class Solution30 {
	public int[] solution(int[] arr, boolean[] flag) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					list.add(arr[i]);
				}
			}else {
				int size = list.size();
				for (int j = list.size()-1; j>=size-arr[i]; j--) {
					list.remove(j);
				}
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
}
