package MyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class demo {
	public static void main(String args[])	{
		List<Integer> a = new LinkedList<>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		
		List<Integer> b  = a;
		
		System.out.println(b);
		
		b.remove(1);
		
		System.out.println(a);
		
		a.add(1,2);
		
		System.out.println(b);
		
		
	}

}
