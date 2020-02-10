package day0210;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Truck_Queue {
	public static void main(String[] args) {

		int bridge_length=2;
		int weight=10;
		int[] truck_weights= {7,4,5,6};
		
		  int[] endTime = new int[truck_weights.length];

	        Queue<Integer> onBridge = new LinkedList<Integer>();
	        int time = 0, cur=0;
	        while(true) {
	            // 도착한 버스 제거 
	            if(!onBridge.isEmpty() && endTime[onBridge.peek()] == time) {
	                weight += truck_weights[onBridge.poll()];
	            }

	            // 대기하는 버스 추가 
	            if(cur < truck_weights.length && truck_weights[cur] <= weight) {
	                onBridge.add(cur);
	                endTime[cur] = time + bridge_length;
	                weight -= truck_weights[cur];
	                cur++;
	            }

	            time++;
	            if(onBridge.isEmpty())
	                break;
	        }
//		int sum=truck_weights[0],answer=1;
//		int i=0;
//		
//		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
//		priorityQueue.add(truck_weights[0]);
//		
//		while(true) {
//			answer++;
//			if(priorityQueue.isEmpty()&&i>=truck_weights.length) {
//				break;
//			}
//		if(i++<truck_weights.length-1) {
//			sum+=truck_weights[i];
//			if(sum>weight) {
//				sum-= truck_weights[i];
//				i--;
//			}else {
//				priorityQueue.add(truck_weights[i]);
//			}
//		}
//		if(answer%bridge_length==0) {
//			sum-=priorityQueue.peek();
//			priorityQueue.poll();
//		}
//	
//		
//			
//		}
//		
//		
//		
//		
		
		
		
		
	
		System.out.println(time);
	}
}
