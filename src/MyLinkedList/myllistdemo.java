package MyLinkedList;

public class myllistdemo {

	public static void main(String[] args) {
		LListMine<Integer> ll = new LListMine();
		
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll.print();
		
		LListMine<Integer> al = ll.reverse();
		
		al.print();
		
		ll.print();
		
		
	}

}
