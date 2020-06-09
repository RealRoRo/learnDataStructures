package arrlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class demo {

	public static void main(String[] args) {
		List<String> cars = new ArrayList(); // U CAN ALSO USE arraylist class objlike
		//Arraylist cars = new ArrayList():	//no generics,so u can enter any dtatype
		
		
		List<String> carz = new ArrayList();
		
		cars.set(0, "benx");
		cars.add("BMW");
		
		carz.add("honda");
		carz.add("Lamborgini");
		carz.add("ferrari");
		
		
		System.out.println(cars);
		
		cars.addAll(carz); //add all things in carz to car
		
		System.out.println(cars);
		
		
	}

}
