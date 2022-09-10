package matrix;

import java.util.Scanner;
//Search an element in a rowwise and columnwise sorted matrix
public class searching_in_rowwise_columnwise_sorted_matrix {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the element to be searched");
		int x=sc.nextInt();
		System.out.println("The array is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int i=0,j=n-1;
		while(i<n && j>=0)
		{
			if(x==a[i][j])
			{
				System.out.println("Element found at "+i+","+j);
				break;
			}
			if(a[i][j]<x)
			{
				i++;
			}
			if(a[i][j]>x)
			{
				j++;
			}
		}
	}
}
