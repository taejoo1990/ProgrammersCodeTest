package level1.codeTest41To50;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main46 {
	public static void main(String[] args) throws ParseException {
		Solution46 sol = new Solution46();
	}
}

/*
 * 二次元整数配列arrがパラメータとして与えられます。 
 * arrの行の数がより多い場合は列の数が行の数と同じになるように各行の末尾に0を追加し、
 * 列の数がさらに多い場合は行の数が列の数と同じになるように各列の末尾に0を追加した
 * 二次元配列をreturnするsolution関数を作成してください。
 */
class Solution46 {
    public int[][] solution(int[][] arr) {
        int n = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[n][n];
        for(int i=0; i<answer.length; i++) {
        	System.arraycopy(arr[i], 0, answer[i], i, arr[0].length);
        }
        return answer;
    }
}
