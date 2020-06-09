package generics;

import java.util.ArrayList;

import generics.pairgen;

public class demo {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList();
;

		pairgen<String,Integer> p1 = new pairgen("apple",15);
		pairgen<Boolean,String> p2 = new pairgen(false,"u r gay");
			
		p1.getDescription();
		p2.getDescription();
		
	}

}
