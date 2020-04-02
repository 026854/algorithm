package day0214;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {

		int[] arr = {1,2,1,3};
		Arrays.sort(arr);
		int[] sel = new int[4];
		combi(arr,sel,0,0);
		
		
	}
	public static void combi(int[] arr, int[] sel, int n, int k) {
		if(k==sel.length) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		if(n==arr.length) {
			return;
		}
		
		
		sel[k] = arr[n];
		combi(arr,sel,n+1,k+1);
		combi(arr,sel,n+1,k);
	}

}
