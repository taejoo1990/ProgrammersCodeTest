package codeTest31To40;

import java.util.ArrayList;

public class Main31 {
	public static void main(String[] args) {

	}
}

/*
 * int�z��arr��boolean�z��flag���p�����[�^�œ`���܂��B
 * �󂢂Ă�z��𐶐����Aflag[i]��true�̏ꍇ�Aarr[i]��arr[i]��ǉ������āA
 * false�̏ꍇ�z��̍Ō�̌��f���폜�����Ƃ�arr[i]�񃋁[�v���Č��ʂ����^�[��
 */
class Solution31 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (list.size()==0 || list.get(list.size() - 1) != arr[i]) {
				list.add(arr[i]);
			}else {
				list.remove(list.size() - 1);
			}
		}
		return list.size()!=0 ? list.stream().mapToInt(i -> i).toArray(): new int[]{-1};
	}

}
