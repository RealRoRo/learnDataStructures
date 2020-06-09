package sortingArray;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n =sc.nextInt(); 
		int ar[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i<n ;i++)	{
			ar[i] = sc.nextInt();
		}
		
		//selectionsorting
		for(int i= 0;i<n-1;i++ )	{
			 
			int min = i;
			for(int j = i;j<n;j++)	{
				if(ar[j]< ar[min])	{
					min = j;
				}
				
				int temp = ar[i];
				ar[i] = ar[min];
				ar[min] = temp;
			}
		}
		
		
		
		
		//over
		System.out.println("Sorted array elements :");
		for(int i : ar)	{
			System.out.print(i+ " ");
		}
	}

}
