package day0116;

public class StrangeWord {
	public static void main(String[] args) {
		String s = "try hello world";
		String answer = "";
		char[] cArray = s.toCharArray();
		int i=0;
		System.out.println(i%2);
		for (char c : cArray) {
			if(c==' ') {
				i=-1;
			}
			
			answer+= (i%2==0) ? String.valueOf(c).toUpperCase():String.valueOf(c).toLowerCase();
			i++;
		}
		System.out.println(answer);
		
		
	}
}
