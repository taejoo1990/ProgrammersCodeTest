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
 * int配列arrとboolean配列flagがパラメータで伝われます。
 * 空いてる配列を生成し、flag[i]がtrueの場合、arr[i]をarr[i]回追加させて、
 * falseの場合配列の最後の元素を削除する作業をarr[i]回ループして結果をリターン
 * 
 * 制限
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
