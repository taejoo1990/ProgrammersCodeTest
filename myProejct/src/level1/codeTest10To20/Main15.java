package level1.codeTest10To20;

import java.util.ArrayList;


public class Main15 {
	public static void main(String[] args) {
		Solution15 sol = new Solution15();
	}
}


class Solution15 {
    public String[] solution(String[] todo_list, boolean[] finished) {
    	ArrayList<String> undoList = new ArrayList<String>();
    	for(int i=0; i<finished.length; i++) {
    		if(!finished[i]) {
    			undoList.add(todo_list[i]);
    		}
    	}
    	String[] answer = undoList.toArray(new String[undoList.size()]);
    	return answer;
    }
}