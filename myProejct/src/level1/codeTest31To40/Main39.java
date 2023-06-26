package level1.codeTest31To40;

import java.math.BigInteger;

public class Main39 {
	public static void main(String[] args) {
		Solution39 sol = new Solution39();
	}
}

/*
 *®”‚©‚ç‚È‚é•¶š—ñn_str‚ª—^‚¦‚ç‚ê‚é‚Æ‚«A
 *n_str‚Ìˆê”Ô¶‚É‰‚ß‚Ä“oê‚·‚é0‚ğˆø‚¢‚½•¶š—ñ‚ğreturn‚·‚é‚æ‚¤‚É
 *solutionŠÖ”‚ğŠ®¬‚³‚¹‚Ä‚­‚¾‚³‚¢B
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
