package level2.codeTest01To10;

import java.util.stream.IntStream;

public class Main06 {
	public static void main(String[] args) {
		Solution06 sol= new Solution06();
	}
}

class Solution06 {
	public int solution(int n) {
		return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
	}
}