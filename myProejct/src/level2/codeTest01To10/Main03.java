package level2.codeTest01To10;

import java.util.Arrays;
import java.util.HashMap;

public class Main03 {

	public static void main(String[] args) {
		Solution03 sol = new Solution03();
		String[] park = new String[] { "OSO","OOO","OXO","OOO" };
		String[] routes = new String[] {"E 2","S 3","W 1" };
		int[] result = sol.solution(park, routes);
		System.out.println(Arrays.toString(result));
	}
}

class Solution03 {
	public int[] solution(String[] park, String[] routes) {
		Position currentPosition = getStartPosition(park);
		for (String tmp : routes) {
			String[] query = tmp.split(" ");
			if (query[0].equals("E") || query[0].equals("W")) {
				int move = Integer.parseInt(query[1]);
				move = query[0].equals("E")? move : move*-1;
				currentPosition.moveX(move);
			}else {
				int move = Integer.parseInt(query[1]);
				move = query[0].equals("S")? move : move*-1;
				currentPosition.moveY(move);
			}
		}
		return new int[] { currentPosition.getY(), currentPosition.getX() };
	}

	private Position getStartPosition(String[] park) {
		Position position = null;
		for (int i = 0; i < park.length; i++) {
			int startIdx = park[i].indexOf("S");
			if (startIdx >= 0) {
				position = new Position(startIdx, i,park[i].length(),park.length);
				break;
			}
		}
		return position;
	}
}

class Position {
	private int x;
	private int y;
	private int maximumX;
	private int maximumY;

	Position(int x, int y, int maximumX, int maximumY) {
		this.x = x;
		this.y = y;
		this.maximumX = maximumX;
		this.maximumY = maximumY;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMaximumX() {
		return maximumX;
	}

	public void setMaximumX(int maximumX) {
		this.maximumX = maximumX;
	}

	public int getMaximumY() {
		return maximumY;
	}

	public void setMaximumY(int maximumY) {
		this.maximumY = maximumY;
	}

	public void moveX(int move){
		int expect = move+this.x;
		this.x = (expect>this.maximumX || expect<0) ? this.x : expect; 
	}
	public void moveY(int move){
		int expect = move+this.y;
		this.y = (expect>this.maximumY || expect<0) ? this.y : expect; 
	}

}
