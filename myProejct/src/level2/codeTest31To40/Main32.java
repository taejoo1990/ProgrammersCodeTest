package level2.codeTest31To40;

import java.util.*;

public class Main32 {
	public static void main(String[] args) {
		Solution32 sol = new Solution32();
	}
}

class Solution32 {
    public int[] solution(int []arr) {
        int before = -1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int tmp : arr) {
        	if(tmp != before) {
        		list.add(tmp);
        	}
        	before = tmp;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
