package arrlist;

import java.util.ArrayList;
import java.util.List;

public class demo2 {

	public static void main(String[] args) {
		List<String> carz = new ArrayList();
		
		carz.add("honda");
		carz.add("Lamborgini");
		carz.add("ferrari");
		carz.add("RoysRoyal");
		carz.add("cheetah");
		
		System.out.println(carz.size());
		
		System.out.println(carz.contains("ferrari"));
		System.out.println(carz.contains("Lotus"));
		
		System.out.println(carz.isEmpty());
		
		System.out.println(carz.get(1)); // get a element
		
		carz.set(1, "Lotus"); //set  a element
		System.out.println(carz.get(1));
		
		carz.remove(1); // remove a element 
		System.out.println(carz);
		
		List<String> removeCarz = new ArrayList();
		removeCarz.add("honda");
		removeCarz.add("susuki");		
		carz.removeAll(removeCarz);
		System.out.println(carz);
		
		carz.clear();
		System.out.println(carz);

	}

}
