package codeTest31To40;

import java.util.ArrayList;

public class Main32 {
	public static void main(String[] args) {
		Solution32 sol = new Solution32();
		sol.solution(new int[] {0, 1, 1, 2, 2, 3},3);
	}
}

/*
 * Int�z��arr�ƁA����k���p�����[�^�ł���܂��B
 * ����k�̔z���arr�̌��f�����ă��^�[�����Ă��������B
 * �󂢂Ă錳�f������ꍇ-1����͂��܂��B
 */
class Solution32 {
	public int[] solution(int[] arr, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int tmp : arr) {
			if(!list.contains(tmp) && list.size()<k) {
				list.add(tmp);
			}
		}
		if(list.size()<k) {
			int size = list.size();
			for(int i=0; i<k-size; i++) {
				list.add(-1);
			}
		}
		return list.stream().mapToInt(i->i).toArray();
	}
}
