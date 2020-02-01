package day0201;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Scoville {
	public static void main(String[] args) {
	
	 
	 int[] scoville= {1,2,3,9,10,12}; 
	 int K=7,answer=0;
	 Integer num=0;

	 
	 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//	 Stack<Integer> stack = new Stack<Integer>();
//	 Integer[] collection = Arrays.stream(scoville).boxed().toArray(Integer[]::new);
//	 Arrays.sort(collection,Comparator.reverseOrder());
//	 
	 for (Integer i : scoville) {
		pq.offer(i);
	}
	 System.out.println(pq);

//	 while(stack.size()>1 && stack.peek()<K) {
//		 
//		 
//		 answer++;
//		 num = (Integer)stack.pop()+stack.pop()*2;
//		 stack.add(num);
//	 }
//	 if(stack.peek()<K) answer=-1;
//	 
//	 System.out.println(answer);
	 
	 
	 while(pq.peek()<=K) {
		 if(pq.size()==1) {
			 answer=-1;
		 }
		 pq.offer(pq.poll()+pq.poll()*2);
		 answer++;
	 }
	 
	 
	 
	 System.out.println(answer);
	}

}
