package day0115;

public class LCMnGCM {
	public static void main(String[] args) {
		int[] answer = new int[2];
		int n = 3, m = 12;
		int tmp1 = n, tmp2 = m;
		int r = 1;
		if (n < m) {
			tmp1 = m;
			tmp2 = n;
		}
		while (r > 0) {
			r = tmp1 % tmp2;
			tmp1 = tmp2;
			tmp2 = r;

		}
		answer[0] = tmp1;
		answer[1] = n * m / tmp1;
		
		
		System.out.println("LCM : "+answer[0]);
		System.out.println("GCM : "+answer[1]);
		
		
	}
}
