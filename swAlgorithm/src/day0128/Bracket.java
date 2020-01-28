package day0128;

import java.util.Stack;

public class Bracket {
	public static void main(String[] args) {
		boolean answer = true;
		Stack<Character> stack = new Stack<Character>();
		
		String s = "(()(";
//		for(char c:s.toCharArray() ) {
//			if(c=='(') {
//				stack.add(c);
//			}else {
//				if(stack.isEmpty()) {answer= false; break;}
//				else {
//					stack.pop();
//				}
//			}
//		}
//		if(!stack.isEmpty()) answer=false;
//		System.out.println(answer);
	
		System.out.println(answer);
		//Just count로 계산 가능
		//( => cnt++
		//) => cnt--;
		
	}
}
