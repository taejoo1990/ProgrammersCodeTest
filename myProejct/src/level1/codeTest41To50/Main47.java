package level1.codeTest41To50;


public class Main47 {
	public static void main(String[] args){
		Solution47 sol = new Solution47();
		sol.solution(new String[] { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...",
				"....x...." }, 2);
	}
}

/*
 * 長方形の形の絵ファイルがあり、この絵ファイルは1×1の大きさの四角形の大きさのピクセルで構成されています。
 * この絵ファイルを示した文字列配列pictureと浄水kが媒介変数に与えられとき、
 * この絵ファイルを縦と横にk杯増やした絵ファイルを示すように文字列配列をreturnする solution関数を作成してください。
 */
class Solution47 {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length * k];
		for (int i = 0; i < picture.length; i++) {
			String str = "";
			for (int j = 0; j < picture[i].length(); j++) {
				for (int l = 0; l < k; l++) {
					str += picture[i].charAt(j);
				}
			}
			for (int l = i*k; l < i*k+k; l++) {
				answer[l] = str;
			}
		}
		return answer;
	}
}
