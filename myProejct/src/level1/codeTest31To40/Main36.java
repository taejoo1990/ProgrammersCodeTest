package level1.codeTest31To40;

import java.util.Arrays;


public class Main36 {
	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		int[] result = sol.solution(new int[] {12, 4, 15, 46, 38, 1, 14});
		System.out.println(Arrays.toString(result));
	}
}

/*
 * int�z��arr1��arr2���p�����[�^�œ`���܂��B 
 * �������ׂ�arr1���傫��������P���Aarr2���傫��������-1�����^�[��
 * �����������ꍇ�A�z��̌��f�̑����Ń��^�[��
 */
class Solution36 {
    public int[] solution(int[] num_list) {
    	Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
