package day0214;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void combi(int[] arr, int[] sel, int n, int k) { 
		if(sel.length==k) {
			String s="";
			for (int i : sel) {
				s+=String.valueOf(i);
			}
			System.out.println(s);
			list.add(Integer.parseInt(s));
			return;
			
		}
		if(arr.length==n) {
			return;
		}
		sel[k] = arr[n];
		combi(arr,sel,n+1,k+1);
		combi(arr,sel,n+1,k);
	}
	public static void main(String[] args) {

		int[] arr = {1,2,1,3};
		Arrays.sort(arr);
		int[] sel = new int[4];
		
		combi(arr,sel,0,0);
		
		

System.out.println(list.size());	
	}

}
