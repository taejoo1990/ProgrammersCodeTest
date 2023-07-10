package level2.codeTest11To20;


public class Main19 {
	public static void main(String[] args) {
		Solution19 sol = new Solution19();		
		System.out.println(sol.solution("01033334444"));
		System.out.println(sol.solution2("01033334444"));
	}
}
class Solution19 {
    public String solution(String phone_number) {
    	String display = phone_number.substring(phone_number.length()-4); 
    	String stars = "";
    	for(int i=0; i<phone_number.length()-4;i++) {
    		stars += "*";
    	}
    	return stars + display;
    }
    public String solution2(String phone_number) {
    	 return phone_number.replaceAll(".(?=.{4})", "*");
    }
}