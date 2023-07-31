package level2.codeTest41To50;


public class Main41 {
	public static void main(String[] args) {
		Solution41 sol = new Solution41();
	}
}

class Solution41 {
	public int[] solution(String[] wallpaper) {
    	int minX = 51;
    	int minY = 51;
    	int maxX = 0;
    	int maxY = 0;
    	for(int i=0; i<wallpaper.length;i++) {
    		int x = i;
    		int y = wallpaper[i].indexOf("#");
    		if(y>=0) {
    			minX = x>minX ? minX : x;
    			minY = y>minY ? minY : y;
    			maxX = x<maxX ? minX : x;
    			 y = wallpaper[i].lastIndexOf("#");
    			maxY = y<maxY ? maxY : y;
    		}
    	}
    	return new int[] {minX,minY,maxX+1,maxY+1};
    }
}
