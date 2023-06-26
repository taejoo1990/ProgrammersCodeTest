package level1.codeTest01To10;

import java.util.Arrays;

public class Main9 {
	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		int[] case1 = {0, 1, 2, 3, 4, 5};
		int[] query = {4, 1, 2};
		sol.solution(case1, query);
	}
}

class Solution9 {
    public int[] solution(int[] arr, int[] query) {
        int index = 0;
        for(int tmp : query) {
        	if(index%2==0) {
        		arr = Arrays.copyOfRange(arr, 0, tmp+1);
        	}else {
        		arr = Arrays.copyOfRange(arr, tmp, arr.length);
        	}
        	index ++;
        }
        return arr;
    }
}