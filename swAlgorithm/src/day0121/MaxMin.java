package day0121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMin {
	public static void main(String[] args) {
		String s="1 2 3 4";
		String[] sarr = s.split(" ");
		ArrayList<Integer> intarr = new ArrayList<Integer>();
		
		for(String str: sarr) {
			intarr.add(Integer.parseInt(str));
		}
		
		Collections.sort(intarr);
		System.out.println(intarr.get(intarr.size()-1));
		
	}

}
