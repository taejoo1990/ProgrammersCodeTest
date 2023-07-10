package level2.codeTest21To30;

import java.util.stream.LongStream;

public class Main27 {
	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		sol.solution(3, 20, 4);
	}
}
class Solution27 {
    public long solution(int price, int money, int count) {
        long result =money-LongStream.range(1, (long)count+1).map(i->i*(long)price).sum();
        System.out.println(result);
        return result<0? result*-1 : 0;     
    }
}