package day0515;

import java.util.HashSet;
import java.util.Set;

public class PlayNum {
	Set<Integer> rightSet = new HashSet<>();
	private int[][] baseball;

	public int solution(int[][] baseball) {
		int answer = 0;
		this.baseball = baseball;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		perm(arr, 0, 3);
		answer = rightSet.size();

		return answer;
	}

	public void perm(int[] arr, int depth, int k) {
		if (depth == k) {
			returnNumber(arr, k);
			return;
		} else {
			for (int i = depth; i < arr.length; i++) {
				swap(arr, i, depth);
				perm(arr, depth + 1, k);
				swap(arr, i, depth);
			}
		}
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void returnNumber(int[] arr, int k) {
		int resultNumber = 0;
		for (int i = 0; i < k; i++) {
			resultNumber += arr[i] * Math.pow(10, k - 1 - i);
		}
		check(resultNumber);
	}

	private void check(int resultNumber) {
		boolean isRight = true;
		int strike = 0;
		int ball = 0;
		String numbToStr = Integer.toString(resultNumber);

		for (int i = 0; i < baseball.length; i++) {
			String tryBall = Integer.toString(baseball[i][0]);
			for (int j = 0; j < 3; j++) {
				char chr = tryBall.charAt(j);
				if (chr == numbToStr.charAt(j)) {
					strike++;
				} else {
					if (numbToStr.contains(Character.toString(chr))) {
						ball++;
					}
				}
			}
			if (strike != baseball[i][1] || ball != baseball[i][2]) {
				isRight = false;
				break;
			}
			strike = 0;
			ball = 0;
		}

		if (isRight) {
			rightSet.add(resultNumber);
		}
	}
}
