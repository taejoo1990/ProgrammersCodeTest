package level2.codeTest41To50;

import java.util.HashMap;

public class Main44 {
	public static void main(String[] args) {
		Solution44 sol = new Solution44();
		sol.solution(new int[][] {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}});
	}
}

class Solution44 {
    public int solution(int[][] targets) {
    	int max=-1;
    	int min=100000001;
    	HashMap<Integer, Missile> missMap = new HashMap<Integer, Missile>();
    	for(int i=0; i<targets.length; i++) {
    		min = targets[i][0]<min? targets[i][0] : min;
    		max = targets[i][1]>max? targets[i][0] : max;
    		missMap.put(i, createMiss(i,targets[i]));	
    	}
    	HashMap shootPointMap = createMap(min,max);
    	return 0;
    }
    private HashMap createMap(int min, int max) {
    	HashMap<Integer, Integer> shootPointMap = new HashMap<Integer, Integer>();
    	for(int i=min; i<=max;i++) {
    		shootPointMap.put(i, 0);
    	}
    	return shootPointMap;
    }
    private Missile createMiss(int misNum,int[] target) {
    	Missile missile = new Missile(misNum, target[0], target[1]);
    	return missile;
    }
}

class Missile{
	private int misNum;
	private int shootIdx;
	private int bombIdx;
	private boolean distroyed;
	public Missile() {}
	public Missile(int misNum, int shootIdx, int bombIdx) {
		this.misNum = misNum;
		this.shootIdx = shootIdx;
		this.bombIdx = bombIdx;
		distroyed = false;
	}
	
	public int getMisNum() {
		return misNum;
	}
	public void setMisNum(int misNum) {
		this.misNum = misNum;
	}
	public int getShootIdx() {
		return shootIdx;
	}
	public void setShootIdx(int shootIdx) {
		this.shootIdx = shootIdx;
	}
	public int getBombIdx() {
		return bombIdx;
	}
	public void setBombIdx(int bombIdx) {
		this.bombIdx = bombIdx;
	}
	public boolean isDistroyed() {
		return distroyed;
	}
	public void setDistroyed(boolean distroyed) {
		this.distroyed = distroyed;
	}
	@Override
	public String toString() {
		return "range : " + shootIdx + " ~ " + bombIdx + "  isDistroyed : " + distroyed;
	}
}

