package level2.codeTest21To30;


public class Main22 {
	public static void main(String[] args) {
		Solution22 sol = new Solution22();		
		System.out.println(sol.solution("abcde"));
	}
}
class Solution22 {
    public String solution(String s) {
        return s.length()%2==0 ? s.substring(s.length()/2-1,s.length()/2+1):String.valueOf(s.charAt(Math.round(s.length()/2))); 
    }
}