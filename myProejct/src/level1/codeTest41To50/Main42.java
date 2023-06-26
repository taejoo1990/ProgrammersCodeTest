package level1.codeTest41To50;

import java.util.ArrayList;

public class Main42 {
	public static void main(String[] args) {
		Solution42 sol = new Solution42();
		sol.solution(new int[][] {{5,192,33},{192,72,95},{33,95,999}});
	}
}

/*
 * n �~ n �T�C�Y�̓񎟌��z��arr���p�����[�^�Ƃ��ė^������Ƃ��A
 * arr�����𖞑������1�łȂ����0��return����
 * solution�֐����쐬���Ă��������B
 */
class Solution42 {
    public int solution(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i].length; j++) {
        		if(arr[i][j] != arr[j][i]) {
        			return 0;
        		}
        	}
        }
        return 1;
    }
}
