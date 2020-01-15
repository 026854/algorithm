package day0115;

public class Hshard {
	public static void main(String[] args) {
		boolean answer = true;
		int x = 12;
		int sum = 0, tmp = x;
		while (x > 9) {
			sum += x % 10;
			x /= 10;
		}
		sum += x;

		if (tmp % sum != 0)
			answer = false;
		System.out.println(answer);
	}

}
