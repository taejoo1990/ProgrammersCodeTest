package level1.codeTest01To10;

public class Main3 {
	public static void main(String[] args) {
		Main3 main = new Main3();
		// String[] arr = {"progressive", "hamburger", "hammer", "ahocorasick"};
		// String tmp = main.solution("Progra21Sremm3", 6,12);

		main.solution(5);
	}
	// 00 01 02 03 plus
	// 13 23 33 plus
	// 32 31 30 minus
	// 20 10 minus
	// 11 12 plus
	// 22 plus
	// 21 minus

	private int[][] solution(int n) {
		int[][] answer = new int[n][n];
		boolean plusMode = true;
		int num = 1;
		int x = 0;
		int y = 0;
		int roopCnt = n;
		for (int i = 0; i < n; i++) {
			// ?��?�� ?�?���
			for (int j = 0; j < roopCnt; j++) {	
				if(i==0) {
					answer[x][y]=num;
					y = plusMode ? y+1 : y-1;
					y = y<n ? y : n-1;
					num++;
				}else {
					y = plusMode ? y+1 : y-1;
					y = y<n ? y : n-1;
					answer[x][y]=num;
					num++;
				}

			}
			// ?�� ?�??��?�� ?��??? ��?, ?����??�를 ?�?��
			roopCnt--;
			// ���이 ?�?���
			for (int j = 0; j < roopCnt; j++) {
				x = plusMode ? x+1 : x-1;
				answer[x][y] = num;
				num++;
			}
	
			// ��? ?�??��?�� ?��??? ��?, ?��?��?�� ?�??��
			plusMode = !plusMode;

		}
		for(int[] arrTmp : answer) {
			for(int tmp : arrTmp) {
				System.out.println(tmp);
			}
		}
		return answer;
	}
}