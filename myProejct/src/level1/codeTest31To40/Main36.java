package level1.codeTest31To40;

import java.util.Arrays;


public class Main36 {
	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		int[] result = sol.solution(new int[] {12, 4, 15, 46, 38, 1, 14});
		System.out.println(Arrays.toString(result));
	}
}

/*
 * int配列arr1とarr2がパラメータで伝われます。 
 * 長さを比べてarr1が大きかったら１を、arr2が大きかったら-1をリターン
 * 長さが同じ場合、配列の元素の総合でリターン
 */
class Solution36 {
    public int[] solution(int[] num_list) {
    	Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
