package priorityQueue;

import java.util.PriorityQueue;

public class demo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq  = new PriorityQueue();
		
		pq.add(1000);
		pq.add(5);
		pq.add(8);
		pq.add(1);
		pq.add(0);

		pq.add(996);
		
		System.out.println(pq); // can print in any order
		
		System.out.println(pq.peek()); // first ele to come out
		
		while(pq.size() != 0) {System.out.println(pq.remove());} // only print in sorted order
		
		

	}

}
