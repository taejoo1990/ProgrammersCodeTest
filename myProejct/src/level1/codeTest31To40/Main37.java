package level1.codeTest31To40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main37 {
	public static void main(String[] args) {
		Solution37 sol = new Solution37();
		sol.solution(new int[] {3, 7, 2, 5, 4, 6, 1}, new boolean[] {false, true, true, true, true, false, false});
	}
}

/*
 *0番からn-1番までn人の学生のうち3人を選抜する全国大会選抜考査を受けました。 
 *順位の高い3人を選抜しなければならないが、
 *個人的な事情で全国大会に参加できない学生がいて参加できる学生の中から
 *順位の高い3人を選抜することにしました。
 *
 *各学生の選抜考査順位を盛り込んだ定数配列rankと
 *全国大会参加可否が含まれたboolean配列attendanceが媒介変数として与えられます。 
 *全国大会に選抜された学生番号を順位の高い順にそれぞれ
 *a、b、c番とする時10000×a+100×b+cをreturnするsolution関数を作成してください
 */
class Solution37 {
    public int solution(int[] rank, boolean[] attendance) {
    	HashMap<Integer,Integer> map = getMap(rank,attendance);
   	ArrayList list = getSortedList(map);

    	return 10000*map.get(list.get(0))+100*map.get(list.get(1))+map.get(list.get(2));
    }
    private HashMap getMap(int[] key, boolean[] flag) {
    	HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
    	for(int i=0; i<flag.length; i++) {
    		if(flag[i]) {
    			map.put(key[i], i);		
    		}
    	}
    	return map;	
    }
    private ArrayList getSortedList(HashMap map) {
    	ArrayList<String> keySet = new ArrayList<>(map.keySet());
    	Collections.sort(keySet);
    	return keySet;
    }
}
