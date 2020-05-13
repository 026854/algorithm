package day0513;

public class MaxNum {
	public static void main(String[] args) {
		String number="1924";
		int k=2;

		StringBuilder sb = new StringBuilder();

		int cnt = number.length() - k;
		int left = 0;
		int right = number.length() - cnt;
		int max = -1;
		int idx = 0;

		while (cnt > 0) {
			max = -1;
			for (int j = left; j <= right; ++j) {
				int num = number.charAt(j) - '0';
				if (num > max) {
					idx = j;
					max = num;
				}
			}
			sb.append(number.charAt(idx));
			left = idx + 1;
			right = number.length() - --cnt;
		}

		System.out.println(sb.toString());
	}
}
