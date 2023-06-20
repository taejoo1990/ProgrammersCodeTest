package codeTest01To10;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		//String[] arr = {"progressive", "hamburger", "hammer", "ahocorasick"};
		main.solution("banana", "ban");
		
	}
	private int solution(String my_string, String is_prefix){
		ArrayList<String> list = getPrefix(my_string);
		//int result =  isContainSuffix(list, is_suffix);
		int result =  isContainSuffix(list, is_prefix);
		System.out.println(list);
		System.out.println(is_prefix);
		System.out.println(result);
		return result<0? 0 : 1;
	}
	
	private ArrayList<String> getPrefix(String str){
		ArrayList<String> list = new ArrayList<String>();
		String word = "";
		for(int i=0; i<str.length() ; i++) {
			word += str.charAt(i);
			list.add(word);
		}
		return list;
	}
	private ArrayList<String> getSuffix(String str){
		ArrayList<String> list = new ArrayList<String>();
		String word = "";
		for(int i=0; i<str.length() ; i++) {
			word= "";
			word += str.substring(i);
			list.add(word);
		}
		return list;
	}
	private int isContainSuffix(ArrayList list, String is_suffix) {
		return list.indexOf(is_suffix);
	}
	
}
