package levelTest;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Level5 {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		String a = "100-33*60+114*81-500+20";
		Pattern pt =Pattern.compile("\\d+\\*\\+\\-\\d+|\\d+\\*\\d+|\\d+\\-\\d+");
		Matcher m = pt.matcher(a);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		String pattern = "\\d+\\tem\\d";
	}
}

class Solution5 {
}
