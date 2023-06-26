package level1.codeTest31To40;

import java.util.Collections;
import java.util.HashMap;

public class Main35 {
	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		int result = sol.solution(new String[] {"a","bc","d","efg","hi"});
		//int result = sol.solution(new int[] {100, 17, 84, 1},new int[] {55, 12, 65, 36});
		System.out.println(result);
	}
}

/*
 * int配列arr1とarr2がパラメータで伝われます。 
 * 長さを比べてarr1が大きかったら１を、arr2が大きかったら-1をリターン
 * 長さが同じ場合、配列の元素の総合でリターン
 */
class Solution35 {
    public int solution(String[] strArr) {
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(String tmp : strArr) {
        	if(hm.containsKey(tmp.length())) {
        		hm.put(tmp.length(), hm.get(tmp.length())+1);
        	}else {
        		hm.put(tmp.length(), 1);
        	}
        }
        return Collections.max(hm.values());
    }
}
