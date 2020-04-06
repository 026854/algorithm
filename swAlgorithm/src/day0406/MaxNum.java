package day0406;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNum {
	public static void main(String[] args) {

		int[] numbers = {6,10,2};
		
		String answer = new String();
		/** 1 **/
		String sArr[] = new String[numbers.length];
		
		/** 2 **/
		for(int i=0; i<sArr.length; i++) {
			sArr[i] = String.valueOf(numbers[i]);
		}
		
		/** 3 **/
		Arrays.sort(sArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				
				return (s2+s1).compareTo(s1+s2);
			}
		});
		
		if(sArr[0].startsWith("0")) answer+="0";
		else {
			for(String s: sArr) {
				answer+=s;
			}
			
		}
		
		System.out.println(answer);
		
		
	}

}
