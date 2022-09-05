package matrix;

import java.util.Scanner;

public class print_matrix_snake {
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
		System.out.println("The array is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The matrix in zigzag pattern is :");
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				for(int j=n-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");	
				}
				System.out.println();
			}
			else {
				for(int j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
