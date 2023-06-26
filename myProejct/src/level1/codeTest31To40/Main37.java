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
 *0�Ԃ���n-1�Ԃ܂�n�l�̊w���̂���3�l��I������S�����I���l�����󂯂܂����B 
 *���ʂ̍���3�l��I�����Ȃ���΂Ȃ�Ȃ����A
 *�l�I�Ȏ���őS�����ɎQ���ł��Ȃ��w�������ĎQ���ł���w���̒�����
 *���ʂ̍���3�l��I�����邱�Ƃɂ��܂����B
 *
 *�e�w���̑I���l�����ʂ𐷂荞�񂾒萔�z��rank��
 *�S�����Q���ۂ��܂܂ꂽboolean�z��attendance���}��ϐ��Ƃ��ė^�����܂��B 
 *�S�����ɑI�����ꂽ�w���ԍ������ʂ̍������ɂ��ꂼ��
 *a�Ab�Ac�ԂƂ��鎞10000�~a+100�~b+c��return����solution�֐����쐬���Ă�������
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
