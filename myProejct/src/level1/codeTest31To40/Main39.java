package level1.codeTest31To40;

import java.math.BigInteger;

public class Main39 {
	public static void main(String[] args) {
		Solution39 sol = new Solution39();
	}
}

/*
 *��������Ȃ镶����n_str���^������Ƃ��A
 *n_str�̈�ԍ��ɏ��߂ēo�ꂷ��0���������������return����悤��
 *solution�֐������������Ă��������B
 */
class Solution39 {
    public String solution(String a, String b) {
    	try {
    		return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));
    	}catch (NumberFormatException e) {
    		return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
		}
    }
}
