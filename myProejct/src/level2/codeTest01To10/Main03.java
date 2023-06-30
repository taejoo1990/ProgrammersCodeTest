package level2.codeTest01To10;

import java.util.ArrayList;


public class Main03 {

	public static void main(String[] args) {
		Solution03 sol = new Solution03();
		String[] park = new String[] { "OSO", "OOO", "OXO", "OOO" };
		String[] routes = new String[] { "E 2", "S 3", "W 1" };
		int[] result = sol.solution(park, routes);
	}
}

class Solution03 {
	public int[] solution(String[] parkArr, String[] routes) {
		Park park = setPark(parkArr);
		for (String tmp : routes) {
			String[] query = tmp.split(" ");
			park.move(query);
		}
		return new int[] {park.getCurrentPosition().getY(),park.getCurrentPosition().getX()};
	}

	private Park setPark(String[] parkArr) {
		Park park = new Park(parkArr[0].length(), parkArr.length);
		for (int i = 0; i < parkArr.length; i++) {
			for (int j = 0; j < parkArr[i].length(); j++) {
				if (parkArr[i].charAt(j) != 'O') {
					if (parkArr[i].charAt(j) == 'S') {
						park.setCurrentPosition(j, i);
					} else {
						park.setStop(j, i);
					}
				}
			}
		}
		return park;
	}
}

class Park {
	private Position currentPosition;
	private Position maximumPosition;
	private ArrayList<Position> stop;

	Park(int maximumX, int maximumY) {
		this.stop = new ArrayList<Position>();
		this.maximumPosition = new Position(maximumX, maximumY);
	}

	public Position getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Position currentPosition) {
		this.currentPosition = currentPosition;
	}

	public void setCurrentPosition(int x, int y) {
		currentPosition = new Position(x,y);
	}

	public void setStop(int x, int y) {
		Position stopPosition = new Position(x, y);
		this.stop.add(stopPosition);
	}

	public void move(String[] query) {
		String direction = query[0];
		int moveCnt = Integer.parseInt(query[1]);
		int mode = 0;
		if(direction.equals("E")||direction.equals("W")) {
			moveCnt = direction.equals("E")? moveCnt : moveCnt*-1;
			mode = 0;
		}else {
			moveCnt = direction.equals("S")? moveCnt : moveCnt*-1;
			mode = 1;
		}
		this.currentPosition = activeMove(moveCnt, mode);
		
	}
	private Position activeMove(int moveCnt, int mode) {
		if(outOfPark(moveCnt,mode)) {
			return currentPosition;
		}
		int roop = moveCnt<0? moveCnt*-1 : moveCnt;
		Position simulator = new Position(currentPosition);
		for(int i=0; i<roop; i++) {
			if(mode==0) {
				simulator.setX(simulator.getX()+(moveCnt<0 ? -1 : 1));
			}else {
				simulator.setY(simulator.getY()+(moveCnt<0 ? -1 : 1));
			}
			for(Position tmp : stop) {
				if(tmp.equals(simulator)) {
					return currentPosition;
				}
			}
		}
		return simulator;
	}
	private boolean outOfPark(int moveCnt, int mode) {
		int expect = mode==0? currentPosition.getX()+moveCnt :currentPosition.getY()+moveCnt; 
		if(mode==0) {
			return expect<0 || expect>=maximumPosition.getX();
		}else {
			return expect<0 || expect>=maximumPosition.getY();
		}
	}

}

class Position {
	private int x;
	private int y;

	Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Position(Position position) {
		this.x = position.getX();
		this.y = position.getY();
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

	public boolean equals(Position position) {
		return this.x == position.getX() && this.y == position.getY();
	}


}
