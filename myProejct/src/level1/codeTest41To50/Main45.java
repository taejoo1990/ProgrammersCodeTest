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
 * 与えられた年月日を比べて、date1が早い場合１，ではない場合０をリターンするメソッド
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
