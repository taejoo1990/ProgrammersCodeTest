package codeTest01To10;

public class Main4 {
	public static void main(String[] args) {
		Main4 main = new Main4();
		main.solution(1, 3);
	}
	private int solution(int a, int b) {
		Dice dice1 = new Dice(a);
		Dice dice2 = new Dice(b);
		int result = 0;
		if(!dice1.isEvenNumber()&&!dice2.isEvenNumber()) {
			result= (int)(Math.pow(dice1.getScore(),2) +Math.pow(dice2.getScore(), 2));
		}else if(!dice1.isEvenNumber()||!dice2.isEvenNumber()) {
			result =  2*(dice1.getScore()+dice2.getScore());
		}else {
			result = dice1.getScore()-dice2.getScore();
			result = result <0 ? result*-1 : result;
		}
		System.out.println(result);
		return result;
	}
}
class Dice{
	private int score;
	private boolean isEvenNumber;
	public Dice(int score) {
		try {
			if(score<1 || score>6) {
				throw new Exception("����������������܂���B");
			}
			this.score=score;
			this.isEvenNumber = score%2==0? true : false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public boolean isEvenNumber() {
		return isEvenNumber;
	}
	public void setEvenNumber(boolean isEvenNumber) {
		this.isEvenNumber = isEvenNumber;
	}
}