package level1.codeTest01To10;


public class Main2 {
	public static void main(String[] args) {
		Main2 main = new Main2();
		//String[] arr = {"progressive", "hamburger", "hammer", "ahocorasick"};
		String tmp = main.solution("Progra21Sremm3", 6,12);
		System.out.println(tmp);
		
	}
	private String solution(String my_string, int s, int e){
		String word = my_string.substring(s,e+1);
		String reverseStr = reverseStr(word);
		my_string = my_string.replace(word, reverseStr);
		return my_string;
	}
	private String reverseStr(String str) {
		String result = "";
		for(int i=str.length()-1 ; i>=0 ; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}