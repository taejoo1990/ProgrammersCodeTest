package levelTest;

import java.util.Arrays;

public class Level2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		String[] info = new String[] { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] query = new String[] { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };
		sol.solution(info, query);
	}
}

class Solution2 {
	public int[] solution(String[] info, String[] query) {
		int[] answer = new int[info.length];
		for (int i = 0; i < query.length; i++) {
			for(int j=0; j< info.length; j++) {
				boolean isPassed = true;
				String[] spec = info[j].split(" ");
				for(int k=0; k<spec.length; k++) {
					if(k==spec.length-1) {
						int score = Integer.parseInt(spec[k]);
						int cutScore = Integer.parseInt(info[i].substring(info[i].length()-3));
						if(score<cutScore) {
							isPassed = false;
						}
						break;
					}
					if(!query[i].contains(spec[k])) {
						isPassed = false;
						break;
					}
				}
				if(isPassed) {
					answer[i] +=1;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
