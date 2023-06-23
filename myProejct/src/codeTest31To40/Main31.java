package codeTest31To40;

import java.util.ArrayList;

public class Main31 {
	public static void main(String[] args) {

	}
}

/*
 * int配列arrとboolean配列flagがパラメータで伝われます。
 * 空いてる配列を生成し、flag[i]がtrueの場合、arr[i]をarr[i]回追加させて、
 * falseの場合配列の最後の元素を削除する作業をarr[i]回ループして結果をリターン
 */
class Solution31 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (list.size()==0 || list.get(list.size() - 1) != arr[i]) {
				list.add(arr[i]);
			}else {
				list.remove(list.size() - 1);
			}
		}
		return list.size()!=0 ? list.stream().mapToInt(i -> i).toArray(): new int[]{-1};
	}

}
