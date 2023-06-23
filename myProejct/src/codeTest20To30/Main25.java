package codeTest20To30;

import java.util.ArrayList;
import java.util.Arrays;

public class Main25 {
	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		String test = "    programmers  ";
		System.out.println(Arrays.toString(test.trim().split("[ ]+")));
		/*
		 * String[] b = Arrays.stream(a).filter(item -> isNotNull(item))
		 * .toArray(String[]::new);
		 */
	}
}

/*
 * -Description 
 *�@String�p�����[�^my_string������܂��B
 *�@my_string�͕K���u�����N���܂߂Ă��āA����ŒP�ꂪ�킯�Ă��܂��B 
 *�@my_string�̒P���z��Ń��^�[�����郁�\�b�h�����������Ă��������B
 * 
 * ����
 * �u�����N���ŏ��A�Ō�ɑ��݂���ꍇ������܂��B 
 * �K��1�ȏ�̒P�ꂪ���݂��܂��B
 */

class Solution25 {
    public String[] solution(String my_string) {
        String[] strArr = my_string.split(" ");
        ArrayList<String> strList = new ArrayList<String>();
        for(String tmp : strArr) {
        	if(tmp.isEmpty()){
        		continue;
        	}
        	strList.add(tmp);
        }
        
    	return strList.toArray(new String[strList.size()]);
    }
}
