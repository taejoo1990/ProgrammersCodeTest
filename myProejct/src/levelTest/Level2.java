package levelTest;

public class Level2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		sol.solution(new String[] {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"});
	}
}

class Solution2 {
	public String[] solution(String[] files) {
		for (int i = 0; i < files.length; i++) {
			String head = "";
			String number = "";
			String tail = "";
			int step = 0;
			for (int j = 0; j < files[i].length(); j++) {
				char tmp = files[i].charAt(j);
				if (step == 0) {
					if (isDigit(tmp)) {
						number += tmp;
						step++;
					} else {
						head += tmp;
					}
				}else if (step == 1) {
					if(!isDigit(tmp)) {
						tail += tmp;
						step++;
					}	
				}else {
					tail += tmp;
				}
			}
			System.out.print(head+"/");
			System.out.print(number+"/");
			System.out.print(tail);
			System.out.println();
		}
		String[] answer = {};
		return answer;
	}
	
	private boolean isDigit(char ch) {
		return (int)ch >= 48 && (int)ch <= 57;
	}
}
