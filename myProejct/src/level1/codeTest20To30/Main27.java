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
 *�@String�p�����[�^myString������܂��B
 *�@myString��'X'����ŕ�����ŕ������ꍇ�A�A���t�@�x�b�g���Ԃ�
 *�@���񂵂��z������^�[��
 * 
 * ����
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
