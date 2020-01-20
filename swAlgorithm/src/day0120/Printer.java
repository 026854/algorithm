package day0120;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
	public static void main(String[] args) {
		int[] priorities= {1,1,9,1,1,1};
		int location = 0;
		int cnt=0;
		
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int num: priorities) {
			pq.offer(num);
			
		}
		
		System.out.println(pq.toString());
		whileout:
		while(!pq.isEmpty()) {
			for(int i=0;i<priorities.length;i++) {
				if(priorities[i]==pq.peek()) {
					System.out.println(i);
					pq.poll();
					cnt++;
					if(i==location) {
						break whileout;
					}
				}
			}
			System.out.println("donese");
			
		}
		
		System.out.println(cnt);
		
		
		
	}
}
