package level1.codeTest31To40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main40 {
	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		sol.solution(new int[] {293, 1000, 395, 678, 94}, new int[] {94, 777, 104, 1000, 1, 12});
	}
}

/*
 *®”‚©‚ç‚È‚é•¶š—ñn_str‚ª—^‚¦‚ç‚ê‚é‚Æ‚«A
 *n_str‚Ìˆê”Ô¶‚É‰‚ß‚Ä“oê‚·‚é0‚ğˆø‚¢‚½•¶š—ñ‚ğreturn‚·‚é‚æ‚¤‚É
 *solutionŠÖ”‚ğŠ®¬‚³‚¹‚Ä‚­‚¾‚³‚¢B
 */
class Solution40 {
    public int[] solution(int[] arr, int[] delete_list) {
    	ArrayList<Integer> arrList = (ArrayList<Integer>)Arrays.stream(arr).boxed().collect(Collectors.toList());
    	for(int tmp : delete_list) {
    		if(arrList.contains(tmp)) {
    			arrList.remove(arrList.indexOf(tmp));
    		}
    	}
        return arrList.stream().mapToInt(i->i).toArray();
    }
    
}
