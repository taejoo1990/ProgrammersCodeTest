package level2.codeTest11To20;

import java.util.Arrays;


public class Main13 {
	public static void main(String[] args) {
		Solution13 sol = new Solution13();
			
	}
}
class Solution13 {
    public boolean solution(int x) {
        return x%Arrays.stream(Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray()).reduce((a,b)->a+b).getAsInt()==0;
    }
}