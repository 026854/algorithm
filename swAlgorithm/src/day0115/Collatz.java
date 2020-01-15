package day0115;

public class Collatz {
	public static void main(String[] args) {
		int answer = -1;
		int num = 626331;
		long n = (long) num;
		for (int i = 0; i < 500; i++) {
			if (n == 1)
				answer = i;
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
		}
		System.out.println(answer);
	}
}
