package day0214;

public class Test {
	public static void main(String[] args) {
		
		long num = 9949999;
		num++;
//		String str = String.valueOf(num);
//		String answer = "";
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)=='0') answer+= '1';
//			else answer+=str.charAt(i);
//		}
//		int a = Integer.valueOf(answer);
//		
//		System.out.println(a);
		int digit=1;
		while(num/digit%10==0) {
			num+=digit;
			digit*=10;
		}
		System.out.println(num);
	}

}
