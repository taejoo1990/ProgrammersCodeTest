package level1.codeTest41To50;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main44 {
	public static void main(String[] args) throws ParseException {
		Solution44 sol = new Solution44();
		sol.solution(new int[] { 2021, 12, 28 }, new int[] { 2021, 12, 29 });
	}
}

/*
 * �^����ꂽ�N�������ׂāAdate1�������ꍇ�P�C�ł͂Ȃ��ꍇ�O�����^�[�����郁�\�b�h
 */
class Solution44 {
	public int solution(int[] date1, int[] date2) {
		if (date1[0] != date2[0]) {
			return date1[0] < date2[0] ? 1 : 0;
		} else {
			if (date1[1] != date2[1]) {
				return date1[1] < date2[1] ? 1 : 0;
			} else {
				if (date1[2] != date2[2]) {
					return date1[2] < date2[2] ? 1 : 0;
				} else {
					return 0;
				}
			}
		}
	}
}
