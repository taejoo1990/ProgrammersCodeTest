package level1.codeTest20To30;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main28 {
	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		int a = sol.solution("403 + 12");
		System.out.println(a);
	}
}

/*
 * -Description Stringパラメータbinomialがあります。 binomialはa op bの数式です。
 * 結果をリターンするメソッドを作成してください。
 * 
 * 制限
 */

class Solution28 {
    
	public int solution(String binomial) {
    	binomial = binomial.replace(" ","");
    	int[] numbers = getNumbers(binomial);
    	if(binomial.contains("+")) {
    		return numbers[0] + numbers[1];
    	}else if(binomial.contains("-")) {
    		return numbers[0] - numbers[1];
    	}else if(binomial.contains("*")) {
    		return numbers[0] * numbers[1];
    	}else {
    		return 0;
    	}
    }
    private int[] getNumbers(String binomial) {
    	return Arrays.stream(binomial.split("[^0-9]")).mapToInt(Integer::parseInt).toArray(); 
    }
	
	public int solution1(String binomial) {
    	binomial = binomial.replace(" ","");
    	String oprator = getOperator(binomial);
    	int[] numbers = getNumbers(binomial);
    	if(oprator.equals("+")) {
    		return numbers[0] +numbers[1]; 
    	}else if(oprator.equals("-")) {
    		return numbers[0] - numbers[1]; 
    	}else{
    		return numbers[0] * numbers[1]; 
    	}
    }
    private String getOperator(String binomial) {
    	Pattern pattern = Pattern.compile("[0-9](.)[0-9]");
		Matcher matcher = pattern.matcher(binomial);
		matcher.find();
		String oprator = matcher.group(1);
		return oprator;
    	//
    }

}
