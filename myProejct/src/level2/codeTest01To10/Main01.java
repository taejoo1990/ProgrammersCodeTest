package level2.codeTest01To10;

import java.util.Arrays;
import java.util.HashMap;

public class Main01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] result = sol.solution(new String[] {"mumu", "soe", "poe", "kai", "mine"}, new String[] {"kai", "kai", "mine", "mine"});
		;
		
	}
}
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> playerMap =  addMap(players);
        for(String calling : callings) {
        	int tmpRank = playerMap.get(calling);
        	String tmpPlayers = players[tmpRank-1];
        	players[tmpRank-1] = calling;
        	players[tmpRank] = tmpPlayers;
        	playerMap.put(calling, tmpRank-1);
        	playerMap.put(tmpPlayers, tmpRank);
        }
        return players;
    }
    private HashMap addMap(String[] arr) {
    	HashMap map = new HashMap();
    	for(int i=0; i<arr.length; i++) {
    		map.put(arr[i], i);
    	}
    	return map;
    }
}