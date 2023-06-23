package codeTest20To30;

import java.util.ArrayList;
import java.util.Arrays;

public class Main26 {
	public static void main(String[] args) {
		Solution26 sol = new Solution26();
	}
}

/*
 * -Description 
 *　StringパラメータmyStringがあります。
 *　myStringを'X'を基準で文字列で分けた場合、各文字列の長さを配列でリターン 
 * 
 * 制限
 */

class Solution26 {
    public int[] solution(String myString) {
        String[] cutWord = myString.split("x");
        int[] answer = new int[myString.charAt(myString.length()-1)=='x'?cutWord.length+1:cutWord.length];
        for(int i=0; i<cutWord.length; i++) {
        	answer[i]=cutWord[i].length();
        }
        return answer;
    }
}
