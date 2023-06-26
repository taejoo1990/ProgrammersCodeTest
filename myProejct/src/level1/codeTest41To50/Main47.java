package level1.codeTest41To50;


public class Main47 {
	public static void main(String[] args){
		Solution47 sol = new Solution47();
		sol.solution(new String[] { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...",
				"....x...." }, 2);
	}
}

/*
 * �����`�̌`�̊G�t�@�C��������A���̊G�t�@�C����1�~1�̑傫���̎l�p�`�̑傫���̃s�N�Z���ō\������Ă��܂��B
 * ���̊G�t�@�C����������������z��picture�Ə�k���}��ϐ��ɗ^�����Ƃ��A
 * ���̊G�t�@�C�����c�Ɖ���k�t���₵���G�t�@�C���������悤�ɕ�����z���return���� solution�֐����쐬���Ă��������B
 */
class Solution47 {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length * k];
		for (int i = 0; i < picture.length; i++) {
			String str = "";
			for (int j = 0; j < picture[i].length(); j++) {
				for (int l = 0; l < k; l++) {
					str += picture[i].charAt(j);
				}
			}
			for (int l = i*k; l < i*k+k; l++) {
				answer[l] = str;
			}
		}
		return answer;
	}
}
