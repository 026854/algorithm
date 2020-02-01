package day0129;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HIndex {
	public static void main(String[] args) {

		int[] citations = {3,0,6,1,5};
		
		Integer[] intCitations = Arrays.stream(citations).boxed().toArray(Integer[]::new);
		
		Arrays.sort(intCitations,Comparator.reverseOrder());
		
		for(int i=0;i<intCitations.length;i++) {
			if(intCitations[i]<i+1) {
				
			}
		}
	}
}
