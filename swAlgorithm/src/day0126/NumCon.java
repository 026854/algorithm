package day0126;

public class NumCon {
	public static void main(String[] args) {

		String answer="";
		int n=9;
		
//		if(n%3==0) {
//			answer += (n/3==1) ? 4:n/3-1+"4"; 
//			
//			
//		}else {
//		
//		
//		answer += (n/3>0) ? n/3:"";
//		
//		answer +=(n%3==0) ? 0:n%3;
//		}	
		int rest = 0;
		while(n>0) {
			rest = n%3;
			
			n/=3;
			if(rest==0) {
				rest = 4;
				n-=1;
			}
			answer = rest+answer;
		}
		
		
		
		System.out.println(answer);
	}
}
