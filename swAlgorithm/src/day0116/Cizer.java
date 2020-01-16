package day0116;

public class Cizer {
	public static void main(String[] args) {

		String s = "AB";
		int n=1,ch=0;
		String answer="";
		char[] c= s.toCharArray();
		for (char d : c) {
			if(d==' ') {answer+=d;continue;}
			
			System.out.println(d-0);
			
			ch = (d-0)+n;
			
			System.out.println(ch);
			if((d-0)<=90&&ch>90) ch-=26;
			if((d-0)<=122&&ch>122) ch-=26;
			System.out.println(ch);
			answer+=(char)ch;
			
		}
		
		System.out.println(answer);
		
	}

}
