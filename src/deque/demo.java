package deque;

public class demo {

	public static void main(String[] args) throws Exception {
		MyDeque<Integer> md = new MyDeque();
		
		md.addFirst(1);
		md.addFirst(2);
		md.addFirst(3);
		
		md.show();
		
		System.out.println("popped ="+md.removeFirst());
		
		md.show();
		
		md.addLast(11);
		md.addLast(11);
		md.addLast(11);
		
		md.show();
		
		System.out.println("popped ="+md.removeLast());
		
		System.out.println(md.peekFirst());
		
		System.out.println(md.peekLast());
	}

}
