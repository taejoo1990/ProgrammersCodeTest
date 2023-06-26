package level1.codeTest41To50;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main46 {
	public static void main(String[] args) throws ParseException {
		Solution46 sol = new Solution46();
	}
}

/*
 * �񎟌������z��arr���p�����[�^�Ƃ��ė^�����܂��B 
 * arr�̍s�̐�����葽���ꍇ�͗�̐����s�̐��Ɠ����ɂȂ�悤�Ɋe�s�̖�����0��ǉ����A
 * ��̐�������ɑ����ꍇ�͍s�̐�����̐��Ɠ����ɂȂ�悤�Ɋe��̖�����0��ǉ�����
 * �񎟌��z���return����solution�֐����쐬���Ă��������B
 */
class Solution46 {
    public int[][] solution(int[][] arr) {
        int n = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[n][n];
        for(int i=0; i<answer.length; i++) {
        	System.arraycopy(arr[i], 0, answer[i], i, arr[0].length);
        }
        return answer;
    }
}
