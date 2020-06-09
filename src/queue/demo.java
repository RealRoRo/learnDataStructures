package queue;

public class demo {

	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<>();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.show();
		
		System.out.println(q.dequeue());
		
		System.out.println(q.peek());
		

	}

}
