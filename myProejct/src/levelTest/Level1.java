package levelTest;

public class Level1 {
	public static void main(String[] args) {
		SolutionLevel1 lv1 = new SolutionLevel1();
		String[] seoul = {"Jane", "Kim"};
		String answer = lv1.solution(seoul);
		System.out.println(answer);
	}
}

/*  
 * String配列Seoulのエレメント中、Kimの位置Xを探し、”金はXにいる”とのStringを
 * リターンするメソッドを完成させてください。配列seoulにKimはただ1回現れ間違うことは
 * ないです。
 * 
 * 制限
 * ｓeoulは長さ1以上、1000以下の配列
 * seoulのエレメントの長さ1以上、20以下の文字列
 * Kimは必ずseoulに含めている。
 * 
 *  * */
class SolutionLevel1 {
	public String solution(String[] seoul) {
        int position = 0;
        if(seoul.length>=1&&seoul.length<=1000){
            for(int i=0 ; i<seoul.length ; i++){
                if(seoul[i].length()>=1 && seoul[i].length()<=20 && "Kim".equals(seoul[i])){
                    position = i;
                }
            }
        }
        String answer = "金は"+ position +"にいる";
        return answer;
    }
}
