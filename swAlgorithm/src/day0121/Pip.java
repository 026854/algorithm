package day0121;

import java.util.Stack;

public class Pip {
	public static void main(String[] args) {

		String arrangement = "()(((()())(())()))(())";
		Stack<Character> stack = new Stack<Character>();
		int answer = 0;
		for(int i=0;i<arrangement.length();i++) {
			if(arrangement.charAt(i)=='(') {
				stack.add(arrangement.charAt(i));
			}else {
				stack.pop();
				if(arrangement.charAt(i-1)=='(') {
					answer+=stack.size();
				}else {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}

}
