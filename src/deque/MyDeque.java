package deque;

public class MyDeque<E> {
	
	public static class Node<E>	{
		E data;
		Node<E> next;
		Node<E> prev;
		public Node(E data)	{
			this.data = data;
			this.next = this.prev = null;
		}
	}
	
	private Node<E> head,tail;
	
	void addFirst(E data)	{
		Node<E> toAdd = new Node(data);
		
		if(head == null )	{
			head = tail = toAdd;
		}
		else	{
			head.next = toAdd;
			toAdd.prev = head;
			head  = toAdd;
		}
	}
	
	void addLast(E data)	{
		Node<E> toAdd = new Node(data);
		
		if(tail == null )	{
			head = tail = toAdd;
		}
		else	{
			tail.prev = toAdd;
			toAdd.next = tail;
			tail  = toAdd;
		}
	}
	
	E removeFirst() throws Exception	{
		if(head == null)	{
			tail = null;
			throw new Exception("No element left");
		}
		else	{
			Node temp = head;
			head = head.prev;
			temp.prev = null;
			head.next = null;
			return (E) temp.data;
		}
	}
	
	E removeLast() throws Exception	{
		if(tail == null)	{
			head = null;
			throw new Exception("No element left");
		}
		else	{
			Node temp = tail;
			tail = tail.next;
			temp.next = null;
			tail.prev = null;
			return (E) temp.data;
		}
	}
	
	E peekFirst() throws Exception	{
		if(head == null)	throw new Exception("No element left");
		else
			return head.data;
	}
	
	E peekLast() throws Exception	{
		if(head == null)	throw new Exception("No element left");
		else
			return tail.data;
	}
	
	
	void show()	{
		Node temp = head;
		while(temp!= null)	{
			System.out.print(" "+ temp.data);
			temp =temp.prev;
		}
		System.out.println();
	}
	
	
}
