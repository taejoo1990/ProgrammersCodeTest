package level1.codeTest41To50;


public class Main43 {
	public static void main(String[] args) {
		Solution43 sol = new Solution43();
	}
}

/*
 * ���� n ���p�����[�^�Ƃ��ė^������Ƃ��A
 * ���̂悤�� n �~ n �T�C�Y�̓񎟌��z���
 * ���^�[�����郁�\�b�h�쐬���Ă��������B
 */
class Solution43 {
    public int[][] solution(int n) {
        int[][] answer =new int[n][n];
        for(int i=0 ; i<n; i++) {
        	answer[i][i] = 1;
        }
        return answer;
    }
}
