package sortingArray;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n =sc.nextInt(); 
		int ar[] = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i<n ;i++)	{
			ar[i] = sc.nextInt();
		}
		
		//bubblesorting
		
		for(int i = 0; i<n ;i++)	{
			
			boolean sorted = true;	//optimed
			for(int j =0;j<n-i-1;j++)	{
				if(ar[j]>ar[j+1])	{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					
					sorted = false; //if there is any swapping
				}
			}
			if(sorted) break;
		}
		
		//over
		System.out.println("Sorted array elements :");
		for(int i : ar)	{
			System.out.print(i+ " ");
		}
		

	}

}
