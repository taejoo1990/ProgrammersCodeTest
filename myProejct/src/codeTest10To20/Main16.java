package codeTest10To20;

import java.util.ArrayList;


public class Main16 {
	public static void main(String[] args) {
		Solution16 sol = new Solution16();
	}
}


class Solution16 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] querie : queries) {
        	int startIdx = querie[0];
        	int finishIdx = querie[1];
        	for(int i=startIdx ; i<=finishIdx; i++) {
        		arr[i] +=1 ;
        	}
        }
        return arr;
    }
}