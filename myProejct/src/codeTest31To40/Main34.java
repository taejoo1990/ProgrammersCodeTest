package codeTest31To40;

import java.util.ArrayList;
import java.util.Arrays;

public class Main34 {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int result = sol.solution(new int[] {100, 17, 84, 1},new int[] {55, 12, 65, 36});
		System.out.println(result);
	}
}

/*
 * int配列arr1とarr2がパラメータで伝われます。 
 * 長さを比べてarr1が大きかったら１を、arr2が大きかったら-1をリターン
 * 長さが同じ場合、配列の元素の総合でリターン
 */
class Solution34 {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length==arr2.length) {
        	int sum1 = Arrays.stream(arr1).sum();
        	int sum2 = Arrays.stream(arr2).sum();
        	return sum1==sum2? 0 : (sum1>sum2?1:-1);
        }else if(arr1.length>arr2.length) {
        	return 1;
        }else {
        	return -1;
        }
    }
}
