package level1.codeTest41To50;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main45 {
	public static void main(String[] args) throws ParseException {
		Solution45 sol = new Solution45();
	}
}

/*
 * �^����ꂽ�N�������ׂāAdate1�������ꍇ�P�C�ł͂Ȃ��ꍇ�O�����^�[�����郁�\�b�h
 */
class Solution45 {
    public int solution(String[] order) {
        int price = 0;
    	for(String tmp : order) {
        	if(tmp.contains("cafelatte")){
        		price += 5000;
        		continue;
        	}
        	price += 4500;
        }
        return price;
    }
}
