package stack;

import MyLinkedList.LListMine;

public class MyStack<E> {
	E data;
	LListMine ll = new LListMine();
	
	void Push(E data)	{
		ll.add(data);
	}
	
	 E Pop() throws Exception	{
		return (E) ll.removeLast();
	}
	
	void Peek() throws Exception	{
		System.out.println(ll.showLast());
	}
	
	void Show()	{
		ll.print();
	}
	
	
}
