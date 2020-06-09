package arrlist;

import java.util.ArrayList;
import java.util.List;

public class toarray {

	public static void main(String[] args) {
		List<String> carz = new ArrayList();
				
		carz.add("honda");
		carz.add("Lamborgini");
		carz.add("ferrari");
		carz.add("RoysRoyal");
		carz.add("cheetah");
		
		String temp[] = new String[carz.size()];
		
		carz.toArray(temp);
		for(String item : temp)	{
			System.out.print(item+ ",");
		}
		System.out.println();
		Object x[] = carz.toArray();
		
		for(Object item : temp)	{
			System.out.print(item+ ",");
		}
	}

}
