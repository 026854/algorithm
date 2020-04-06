package day0402;

public class Facto {
	  public int solution(int n) {
	      int[] arr = new int[n+1];
	      arr[0]=1;
	      arr[1]=1;
	      for(int i=2;i<=n;i++){
	          arr[i] = (arr[i-2]+arr[i-1])%1000000007;
	      }
	      return arr[n];
	  }
	  public static void main(String[] args) {
		Facto fa = new Facto();
		System.out.println(fa.solution(5));
		
		int a = 12;
		String s = "12";
		
		System.out.println(s.compareTo("21"));
		
		System.out.println(a+1);
		System.out.println(s+1);
		
	}
}
