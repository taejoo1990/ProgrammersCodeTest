package level1.codeTest20To30;

public class Main22 {
	public static void main(String[] args) {
		Solution22 sol = new Solution22();
	}
}

/*
 * -Description 
 * ������p�����[�^myString��pat������܂��B
 * myString�̌��f�̒���Pat���܂߂ďI���Œ��̕���������^�[�����郁�\�b�h
 * 
 * -���� myString�͕K��pat���܂߂Ă��܂��B myString�͑啶���Ə��������敪���܂��B
 */

class Solution22 {
	public String solution(String myString, String pat) {
		return myString.substring(0, myString.lastIndexOf(pat)+pat.length());
	}
}
