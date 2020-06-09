package priorityQueue;
import java.util.Scanner;
import java.util.PriorityQueue;

public class max3ele {
	public static void main(String args[])	{
		PriorityQueue<Integer> pq = new PriorityQueue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int n = sc.nextInt();
		while(n-- > 0) {
			pq.add(sc.nextInt());
		}
		System.out.println(pq);
	}

}
