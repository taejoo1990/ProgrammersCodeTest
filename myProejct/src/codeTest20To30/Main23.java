package codeTest20To30;

public class Main23 {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
	}
}

/*
 * -Description ������p�����[�^myString��pat������܂��B myString��pat�̓o�ꐔ�����^�[�����郁�\�b�h
 * 
 * -���� -
 */

class Solution23 {
	public int solution(String myString, String pat) {
		int answer = 0;
		// pat��������Ń��[�v���g���܂��B
		// Stream��Replace�ł͏d�Ȃ�ꍇ�𐔂��܂���B
		for (int i = 0; i < myString.length(); i++) {
			if (myString.length() - i >= pat.length() && myString.charAt(i) == pat.charAt(0)) {
				answer++;
				for (int j = 1; j < pat.length(); j++) {
					if (myString.charAt(i + j) != pat.charAt(j)) {
						answer--;
						break;
					}
				}
			}
		}
		return answer;
	}
}
