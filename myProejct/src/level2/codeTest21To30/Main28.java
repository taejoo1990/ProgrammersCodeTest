package level2.codeTest21To30;


public class Main28 {
	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		System.out.println((int)'9');
	}
}
class Solution28 {
    public boolean solution(String s) {
        return (s.length()==4 ||s.length()==6)&&(s.chars().filter(ch->Character.isDigit(ch)).toArray().length==s.length());
    }
}