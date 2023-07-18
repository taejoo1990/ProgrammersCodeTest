package level2.codeTest31To40;

import java.util.HashMap;
import java.util.Iterator;

public class Main40 {
	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		System.out.println(sol.solution("500220839878", "7"));
	}
}

class Solution40 {
	public int solution(String t, String p) {
		int result = 0;
		HashMap<Integer, String> charMap = getMap(t, p);
		Iterator<Integer> keys = charMap.keySet().iterator();
		while (keys.hasNext()) {
			result = calCnt(charMap.get(keys.next()), p, result);
		}
		return result;
	}

	private HashMap<Integer, String> getMap(String t, String p) {
		char[] charArr = t.toCharArray();
		HashMap<Integer, String> charMap = new HashMap<Integer, String>();
		boolean finalRoop = false;
		int index = 0;
		for (int i = 0; i < t.length(); i++) {
			String tmp = "";
			finalRoop = t.length()-i == p.length() ? true : false;
			for (int j = 0; j < p.length(); j++) {
				tmp += charArr[i + j];
			}
			charMap.put(index, tmp);
			if(finalRoop) {
				break;
			}
			index++;
		}
		return charMap;
	}

	private int calCnt(String a, String b, int cnt) {
		long tNum = Long.parseLong(a);
		long pNum = Long.parseLong(b);
		return tNum <= pNum ? cnt + 1 : cnt;
	}
}
