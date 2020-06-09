package generics;

public class pairgen<X,Y> {
	X x;
	Y y;
	pairgen(X x,Y y)	{
		this.x=x;
		this.y=y;
	}
	public void getDescription()	{
		System.out.println(x+ " & "+y);
	}
}
