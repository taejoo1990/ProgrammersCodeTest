package level2.codeTest21To30;

import java.util.Arrays;

public class Main21 {
	public static void main(String[] args) {
		Solution21 sol = new Solution21();		

	}
}
class Solution21 {
    public int[] solution(int[] arr) {
       if(arr.length<=1) {
    	   return new int[] {-1};
       }
    	return Arrays.stream(arr).filter(i->i!=Arrays.stream(arr).min().getAsInt()).toArray(); 
    }
}