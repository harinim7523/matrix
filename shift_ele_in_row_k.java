package matrix;

import java.util.Scanner;

//shift the matrix elements in the row by k elements
public class shift_ele_in_row_k {
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
		System.out.println("Enter the element k");
		int k=sc.nextInt();
		System.out.println("The array is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The array after shifting:");
		for(int i=0;i<n;i++)
		{
			for(int j=k;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			for(int j=0;j<k;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
