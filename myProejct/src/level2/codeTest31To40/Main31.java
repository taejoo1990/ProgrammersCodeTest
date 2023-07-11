package level2.codeTest31To40;

import java.util.*;

public class Main31 {
	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		System.out.println(Arrays.toString(sol.solution(3, 12)));
	}
}

class Solution31 {
	public int[] solution(int n, int m) {
		//int GCD = calGCD(m, n % m);
		ArrayList<Integer> DivisorsForN = calDivisor(n);
		ArrayList<Integer> DivisorsForM = calDivisor(m);
		ArrayList<Integer> Cds = calGCD(DivisorsForN,DivisorsForM);
		int GCD = Collections.max(Cds);
		return new int[] { GCD, n * m / GCD };
	}

	private int calGCD(int b, int r) {
		return b % r == 0 ? r : calGCD(b, b % r);
	}
	private ArrayList<Integer> calGCD(ArrayList<Integer> DivisorsForN,ArrayList<Integer> DivisorsForM){
		ArrayList<Integer> Cds = new ArrayList<Integer>();
		Cds.addAll(DivisorsForN);
		Cds.retainAll(DivisorsForM);
		return Cds;
	}

	private ArrayList<Integer> calDivisor(int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1; i<=num/2+1; i++) {
			if(num%i ==0) {
				arr.add(i);
			}
		}
		arr.add(num);
		return arr;
	}
}
