package levelTest;

public class Level2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
	}
}

class Solution2 {
	public boolean solution(String[] phone_book) {
		for (String tmp : phone_book) {
			for (int i = 0; i < phone_book.length; i++) {
				if (!tmp.equals(phone_book[i]) && phone_book[i].indexOf(tmp) == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
