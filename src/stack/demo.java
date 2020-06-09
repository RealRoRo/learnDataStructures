package stack;

public class demo {

	public static void main(String[] args) throws Exception {
		MyStack<String> s = new MyStack();
		s.Push("hii");
		s.Push("i");
		s.Push("m");
		s.Push("Stack");
		s.Push("5");
		
		s.Show();
			
		String a= s.Pop();
		System.out.println("popped = "+a);
		
		s.Show();
	}

}
