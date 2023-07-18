package level2.codeTest31To40;


public class Main38 {
	public static void main(String[] args) {
		Solution38 sol = new Solution38();
		System.out.println(sol.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
	}
}

class Solution38 {
	
	public int solution(int[][] sizes) {
		int maxX =0;
		int maxY =0;
		for(int i=0; i<sizes.length; i++) {
			int x = sizes[i][0];
			int y = sizes[i][1];
			if(x<y) {
				sizes[i]= swapXy(sizes[i]);
				x = sizes[i][0];
				y = sizes[i][1];
			}
			maxX = x>maxX? x : maxX; 
			maxY = y>maxY? y : maxY;
		}
		return maxX*maxY;
	}
	private int[] swapXy(int[] size) {
		int tmp = size[0];
		size[0] = size[1];
		size[1] = tmp;
		return size;
	}

}
