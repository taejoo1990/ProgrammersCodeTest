package level1.codeTest41To50;


public class Main43 {
	public static void main(String[] args) {
		Solution43 sol = new Solution43();
	}
}

/*
 * 整数 n がパラメータとして与えられるとき、
 * 次のような n × n サイズの二次元配列を
 * リターンするメソッド作成してください。
 */
class Solution43 {
    public int[][] solution(int n) {
        int[][] answer =new int[n][n];
        for(int i=0 ; i<n; i++) {
        	answer[i][i] = 1;
        }
        return answer;
    }
}
