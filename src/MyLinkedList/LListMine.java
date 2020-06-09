package MyLinkedList;

public class LListMine<E> {
	
	public class Node<E>	{
		E data;
		Node next;
		Node prev;
		Node(E data)	{
			this.data = data;
			next = null;
			prev = null;
		}
	}
	Node head;
	
	public void add(E data)	{
		Node toAdd = new Node(data);
		
		if(isEmpty())	{	//initial case
			head = toAdd;
			toAdd.prev = null;
		}
		else	{
			Node temp = head;
			while(temp.next != null)	{
				temp = temp.next;
			}
			temp.next = toAdd;
			toAdd.prev = temp;
		}
	}
	
	void add(int index,E data)	{
		try {
		Node toAdd = new Node(data);
		Node temp = head;
		Node temp1 = head.next;
		while(index > 1)	{
			temp = temp.next;
			temp1 = temp1.next;
			index--;
		}
		temp.next = toAdd;
		toAdd.prev = temp;
		toAdd.next = temp1 ;
		temp1.prev = toAdd;
		}catch(Exception e) {throw new IndexOutOfBoundsException();}
	}
	
	void get(int index)	{
		Node temp = head;
		while(index > 0)	{
			temp = temp.next;
			index--;
		}
		
		System.out.println(temp.data);
	}
	
	void remove()	{
		Node temp = head;
		Node del = head.next;
		while(del.next != null)	{
			temp = temp.next;
			del = del.next;
		}
		temp.next = null;
		del.prev = null;
		System.gc();
		
	}
	
	 public LListMine<E>  reverse()	{
		LListMine ll = new LListMine();
		Node temp = head;
		while(temp.next != null)	{
			temp = temp.next;
		}
		do{
			ll.add(temp.data);
			temp = temp.prev;
		}while(temp != head);
		
		ll.add(head.data);
	
		return ll;
	}
	
	
	
	
	public E showLast()	throws Exception{
		Node temp = head;
		if(head == null)	{
			throw new Exception("NO element left");
		}
		try	{
		
		while(temp.next != null)	{
			temp = temp.next;
		}
		return (E) temp.data;
		}catch(Exception e) {throw new Exception("NO element left");}
	}
		
	
	
	
	public E removeLast()	throws Exception{
		Node temp = head;
		if(head == null)	{
			throw new Exception("NO element left");
		}
		try	{
		E toRemove;
		if(temp.next == null)	{
			toRemove = (E) head.data;
			head = null;
		}
		
		while(temp.next.next != null)	{
			temp = temp.next;
		}
		toRemove = (E) temp.next.data;
		temp.next = null;
		return toRemove;
		}catch(Exception e) {throw new Exception("NO element left");}
		
	}
	void clear()	{
		head = null;
	}
	
	void remove(int index)	{
		Node temp = head;
		Node temp1 = head.next;
		while(index > 1)	{
			temp = temp.next;
			temp1 = temp1.next;
			index--;
		}try {
		Node del = temp1;
		temp.next = temp1.next;
		del.next = null;
		del.prev = null;
		}
		catch(Exception e) {throw new IndexOutOfBoundsException();}
	}
	
	public void print()	{
		Node item = head;
		while(item != null)	{
			System.out.print(item.data+" ");
			item = item.next;
		}
		System.out.println();
		
	}
	
	boolean isEmpty()	{
		return head==null;
	}
}
