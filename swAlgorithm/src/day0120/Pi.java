package day0120;

public class Pi {
	public static void main(String[] args) {
		
		int n=200;
		float an=0;
		for(int i=1;i<n;i++) {
			an += (Math.pow(-1, i-1))/(2*i-1);
		}
		System.out.println(String.format("%.6f", an*4));
		
	}

}
