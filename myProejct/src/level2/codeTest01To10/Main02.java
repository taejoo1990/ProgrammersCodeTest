package level2.codeTest01To10;

import java.util.HashMap;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}class Solution02 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> friendsMap =puttingPerson(name,yearning);
        for(int i=0; i<photo.length; i++) {
        	for(int j=0; j<photo[i].length; j++) {
        		if(friendsMap.containsKey(photo[i][j])) {
        			answer[i]+=friendsMap.get(photo[i][j]);
        		}
        	}
        }
        return answer;
    }
    private HashMap<String, Integer> puttingPerson(String[] name, int[] yearning){
    	HashMap<String, Integer> map = new HashMap<String,Integer>();
    	for(int i=0; i<name.length; i++) {
    		map.put(name[i], yearning[i]);
    	}
    	return map;
    }
}

