package level1.codeTest20To30;

import java.util.ArrayList;
import java.util.Arrays;

public class Main29 {
	public static void main(String[] args) {
		Solution29 sol = new Solution29();
		sol.solution("cabab");
		System.out.println();
	}
}

/*
 * -Description 
 * String�p�����[�^myStr������܂��B 
 * myStr�̒���"a","b","c"�����őg��ł��镶���񂪂���΂����ŕ�����𕪂��āA�z������^�[��
 * 
 * ����
 */

class Solution29 {
    public String[] solution(String myStr) {
        String[] answer = myStr.replace("a"," ").replace("b"," ").replace("c", " ").split(" ");
        answer = removeEmpty(answer);
        if(answer.length==0) {
        	answer = new String[1];
        	answer[0] = "EMPTY";
        }
        return answer;
    }
    private String[] removeEmpty(String[] target) {
    	ArrayList<String> noEmptyList = new ArrayList<String>();
    	for(String tmp : target) {
    		if(!tmp.isEmpty()) {
    			noEmptyList.add(tmp);
    		}
    	}
    	return noEmptyList.toArray(new String[noEmptyList.size()]);
    }
}
