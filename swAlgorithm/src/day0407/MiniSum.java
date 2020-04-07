package day0407;

import java.util.Arrays;
import java.util.Comparator;

public class MiniSum {
	public static void main(String[] args) {

		int[] A = {1,2};
		int[] B = {3,4};
		
		 int answer = 0;
	        
	        
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int j=B.length-1;
	        
	        for(int i=0;i<A.length;i++){
	            answer+=A[i]*B[j-i];
	        }

//		int sum=0;
//		Integer[] BArr = Arrays.stream(B).boxed().toArray(Integer[]::new);
//		
//		Arrays.sort(A);
//		Arrays.sort(BArr,new Comparator<Integer>() {
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			// TODO Auto-generated method stub
//			
//			return o2.compareTo(o1);
//		}
//			
//		});
//		for(int i=0;i<A.length;i++) {
//			sum+=A[i]*BArr[i];
//		}
//		System.out.println(sum);
		
	}

}
