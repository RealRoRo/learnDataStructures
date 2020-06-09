package queue;

public class MyQueue<E> {
	
	public class Node<E>	{
		E data;
		Node next;
		public Node(E data)	{
			this.data = data;
			next = null;
		}
	}
	
	private Node<E> head,rear;
	
	 void enqueue(E data)	{
		Node<E> toAdd = new Node(data);
		
		if(head == null)	{
			head = rear = toAdd;
		}

		rear.next = toAdd;
		rear = rear.next; 
		
	}
	 
	 public E  dequeue()	{
		 
		 if(head == null)	{
			 return null;
		 }
		 		 
		 Node temp = head;
		 head = head.next;
		 
		 if(head == null)	{
			 rear = null;
		 }
		 
		 return (E) temp.data;
		 
	 }
	 
	 void show()	{
		 Node temp = head;
		 do	{
			 System.out.print(temp.data+" ");
			 temp = temp.next;
		 }while(temp != rear.next);
		 System.out.println();
	 }
	
	 
	 E peek()	{
		 if(head == null)	{
			 return null;
		 }
		 Node temp= head;
		 while(temp.next!=null)	{
			 temp = temp.next;
		 }
		 return (E) temp.data;
		 
		 
	 }

}
