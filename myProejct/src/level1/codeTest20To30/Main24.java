package level1.codeTest20To30;

import java.util.ArrayList;

public class Main24 {
	public static void main(String[] args) {
		Solution24 sol = new Solution24();
	}
}

/*
 * -Description 
 *　String配列パラメータstrArrがあります。 
 *　配列の元素で"ad"を含めている元素を削除し整列してリターンするメソッド
 * 
 * -制限 -
 */

class Solution24 {
    public String[] solution(String[] strArr) {
        ArrayList<String> strList = new ArrayList<String>();
        for(String tmp : strArr) {
        	if(!tmp.contains("ad")) {
        		strList.add(tmp);
        	}
        }
        return strList.toArray(new String[strList.size()]);
    }
}
