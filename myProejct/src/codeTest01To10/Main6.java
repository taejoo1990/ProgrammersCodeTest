package codeTest01To10;


public class Main6 {
	public static void main(String[] args) {
		Solution6 solution = new Solution6();
		int[] slicer= {1,5,2};
		int n = 4;
		int[] num_list= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] hey = solution.solution(n,slicer,num_list);
		for(int tmp : hey) {
			System.out.println(tmp);
		}
    }
}

class Solution6{
    public int[] solution(int n, int[] slicer, int[] num_list) {
    		int[] answer = {};
        	if(n==1) {
        		answer = cutIntArr(0,slicer[1],1,num_list);  
            }else if(n==2) {
            	answer = cutIntArr(slicer[0],num_list.length-1, 1 , num_list);  
            }else if(n==3) {
            	answer = cutIntArr(slicer[0],slicer[1], 1 , num_list);  
            }else if(n==4) {
            	answer = cutIntArr(slicer[0],slicer[1], slicer[2] ,num_list);  
            }
        	return answer;
    }
    
    private int[] cutIntArr(int startIdx, int endIdx, int plusIdx, int[] num_list) {
    	int[] result = new int[((endIdx-startIdx)/plusIdx)+1];
    	int index = 0;
    	for(int i=startIdx ; i<=endIdx ; i+=plusIdx) {
    		result[index] = num_list[i];
    		index++;
    	}
    	return result;
    }
}

