package MyLinkedList;

import java.util.*;

public class ArrayVsLink {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList();
		List<Integer> ll = new LinkedList();
		getTimeDiff(al);
		getTimeDiff(ll);
		
	}
	
	static void getTimeDiff(List<Integer> a)	{
		long start = System.currentTimeMillis();
		for(int i =0;i<1000000;i++){
			a.add(0 ,i);
		}
		long end = System.currentTimeMillis();
		System.out.println(a.getClass().getName()+ " --> "+(end - start));
	}	
}
