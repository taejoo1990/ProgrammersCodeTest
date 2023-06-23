package levelTest;

public class Level3 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String[][] book_time = { { "15:00", "17:00" }, { "16:40", "18:20" }, { "14:20", "15:20" }, { "14:10", "19:20" },
				{ "18:20", "21:20" } };
		System.out.println(sol.solution(book_time));

	}
}

class Solution3 {
	public int solution(String[][] book_time) {
		int[][] book_timeInt = new int[book_time.length][2];
		int rooms = 0;
		for (int i = 0; i < book_time.length; i++) {
			for (int j = 0; j < book_time[i].length; j++) {
				book_timeInt[i][j] = Integer.parseInt(book_time[i][j].replace(":", ""));
			}
		}
		int answer = 0;
		for (int i = 0; i < 2400; i ++) {
			int room = 0;
			for (int[] tmp : book_timeInt) {
				boolean changeH = false; 
				int closeTime = String.valueOf(tmp[1]).charAt(2) - '0';
				if(closeTime > 4) {
					changeH=true;
				} else {
					changeH=false;
				}
				if (tmp[0] < i && (changeH?tmp[1]+50:tmp[1]+10) > i) {
					room++;
				}
				answer = room > answer ? room : answer;
			}
		}
		return answer;
	}
}
