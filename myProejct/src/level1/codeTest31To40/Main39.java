package level1.codeTest31To40;

import java.math.BigInteger;

public class Main39 {
	public static void main(String[] args) {
		Solution39 sol = new Solution39();
	}
}

/*
 *整数からなる文字列n_strが与えられるとき、
 *n_strの一番左に初めて登場する0を引いた文字列をreturnするように
 *solution関数を完成させてください。
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
