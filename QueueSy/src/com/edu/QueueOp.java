package com.edu;

import java.util.PriorityQueue;

public class QueueOp {
	public static void main(String[] args) {
		PriorityQueue <Integer> pq=new PriorityQueue();
		pq.offer(100);
		pq.offer(200);
		pq.offer(300);
		pq.offer(100);
		pq.offer(200);
		pq.offer(400);
		//pq.offer(null); //null values not allowed
		System.out.println("Add "+pq);
		pq.poll();
		System.out.println("poll "+pq);
		pq.remove();
		System.out.println("Remove :"+pq);
		System.out.println("Peek "+pq.peek());
	}


}
