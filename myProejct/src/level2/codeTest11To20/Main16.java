package level2.codeTest11To20;

import java.util.Arrays;

public class Main16 {
	public static void main(String[] args) {
		Solution16 sol = new Solution16();		
			
	}
}
class Solution16 {
    public int[] solution(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(i->i%divisor==0).toArray().length==0?new int[] {-1}:Arrays.stream(arr).filter(i->i%divisor==0).sorted().toArray();
    }
}