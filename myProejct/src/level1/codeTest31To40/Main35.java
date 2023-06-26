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
 * int�z��arr1��arr2���p�����[�^�œ`���܂��B 
 * �������ׂ�arr1���傫��������P���Aarr2���傫��������-1�����^�[��
 * �����������ꍇ�A�z��̌��f�̑����Ń��^�[��
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
