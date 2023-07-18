package level2.codeTest31To40;

import java.util.*;

public class Main37 {
	public static void main(String[] args) {
		Solution37 sol = new Solution37();
		sol.solution(new int[] {-2, 3, 0, 2,-5});
		sol.solution2(new int[] {-2, 3, 0, 2,-5}, 3, 0,new Combination());
	}
}

//Given array consist of Integer.
//Write solution count of combination.
//the combination consist of three Integer and amount that 
//sum each members is zero. 
class Solution37 {
	private ArrayList<Combination> result = new ArrayList<Combination>();
	public int solution(int[] number) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		ArrayList<Combination> comList = new ArrayList<Combination>();
		for(int i=0; i<number.length; i++) {
			num1 = number[i];
			for(int j=i+1 ; j<number.length; j++) {
				num2 = number[j];
				for(int k=j+1 ; k<number.length; k++) {
					num3 = number[k];
					if(num1+num2+num3==0) {
						comList.add(new Combination(num1, num2, num3));
					}
				}
			}
		}
		System.out.println(comList);
		return comList.size();
	}
	
	public void solution2(int[] number, int cnt, int index, Combination com) {
		if(cnt==3) {
			com.setNum1(number[index]);
			solution2(number, cnt-1, index+1, com);
		}else if(cnt==2){
			com.setNum2(number[index]);
			solution2(number, cnt-1, index+1, com);
		}else if(cnt==1) {
			com.setNum3(number[index]);
			result.add(com);
		}else {
			System.out.println("error");
		}
	}
}
class Combination{
	private int num1;
	private int num2;
	private int num3;
	
	public Combination() {
	}
	public Combination(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	@Override
	public String toString() {
		return "{"+this.num1+" , "+this.num2+" , "+this.num3+"}";
	}
}

