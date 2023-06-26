package level1.codeTest20To30;

import java.util.ArrayList;
import java.util.Collections;

public class Main27 {
	public static void main(String[] args) {
		Solution27 sol = new Solution27();
	}
}

/*
 * -Description 
 *　StringパラメータmyStringがあります。
 *　myStringを'X'を基準で文字列で分けた場合、アルファベット順番で
 *　整列した配列をリターン
 * 
 * 制限
 */

class Solution27 {
    public String[] solution(String myString) {
    	String[] cutWord= myString.split("x");
    	ArrayList<String> strList = new ArrayList<String>();
    	for(String tmp : cutWord) {
    		if(!tmp.isEmpty()) {
    			strList.add(tmp);
    		}
    	}
    	Collections.sort(strList);
        return strList.toArray(new String[strList.size()]);
    }
}
