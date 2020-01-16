package day0116;

import java.util.Arrays;

public class RemoveNum {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		 if(arr.length<=1) System.out.println(-1);
	     int min = Arrays.stream(arr).min().getAsInt();
	      
	     System.out.println( Arrays.stream(arr).filter(e -> e!=min).toArray());
	}
}
