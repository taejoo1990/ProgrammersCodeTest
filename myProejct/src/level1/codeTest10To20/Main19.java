package level1.codeTest10To20;

import java.util.ArrayList;

public class Main19 {
	public static void main(String[] args) {
		Solution19 sol = new Solution19();
	}
}

class Solution19 {
    public int solution(String myString, String pat) {
        String transferStr = "";
        for(int i=0 ; i<myString.length();i++) {
        	transferStr+= myString.charAt(i)=='A'?"B":"A";  
        }
        return transferStr.contains(pat)?1:0;
    }
}