package levelTest;

import java.util.HashMap;
import java.util.HashSet;

public class Level6 {
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		sol.solution(new int[] { 1, 2, 1, 3, 1, 4, 1, 2 });
	}
}

class Solution6 {
	public int solution(int[] topping) {
		HashSet<Integer> cake1 = new HashSet<Integer>();
		HashMap<Integer,Integer> cake2 = new HashMap<Integer,Integer>();
		int answer = 0;
		for(int i=0; i<topping.length; i++) {
			if(cake2.containsKey(topping[i])) {
				cake2.put(topping[i],cake2.get(topping[i])+1);
			}else {
				cake2.put(topping[i],1);
			}
		}
		for (int i = 0; i < topping.length-1; i++) {
			cake1.add(topping[i]);
			cake2.put(topping[i], cake2.get(topping[i])-1);
			if(cake2.get(topping[i])==0) {
				cake2.remove(topping[i]);
			}
			answer = cake1.size() == cake2.size() ? answer+1 : answer;
		}
		return answer;
	}
}
