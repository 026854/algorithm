package day0120;

public class Fibo {
	public static void main(String[] args) {
		int a=0,b=1,sum=0,n=100;
	      for(int i=2;i<=n;i++){
	        sum=a+b;
	        sum%=1234567;
	        System.out.println(sum);
	        a=b;
	        b=sum;
	        
	      }
	}
}
