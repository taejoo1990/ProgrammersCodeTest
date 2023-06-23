package codeTest20To30;

import java.util.ArrayList;
import java.util.Arrays;

public class Main25 {
	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		String test = "    programmers  ";
		System.out.println(Arrays.toString(test.trim().split("[ ]+")));
		/*
		 * String[] b = Arrays.stream(a).filter(item -> isNotNull(item))
		 * .toArray(String[]::new);
		 */
	}
}

/*
 * -Description 
 *　Stringパラメータmy_stringがあります。
 *　my_stringは必ずブランクを含めていて、それで単語がわけています。 
 *　my_stringの単語を配列でリターンするメソッドを完成させてください。
 * 
 * 制限
 * ブランクが最初、最後に存在する場合もあります。 
 * 必ず1個以上の単語が存在します。
 */

class Solution25 {
    public String[] solution(String my_string) {
        String[] strArr = my_string.split(" ");
        ArrayList<String> strList = new ArrayList<String>();
        for(String tmp : strArr) {
        	if(tmp.isEmpty()){
        		continue;
        	}
        	strList.add(tmp);
        }
        
    	return strList.toArray(new String[strList.size()]);
    }
}
