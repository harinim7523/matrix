package matrix;

import java.util.Scanner;

public class diagonal_traversal {
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
		System.out.println("The diagonal traversal of the matrix:");
		for(int k=0;k<n;k++)
		{
			int i=k;
			int j=0;
			while(i>=0)
			{
				System.out.print(a[i][j]+" ");
				i--;
				j++;
			}
		}
		for(int k=1;k<n;k++)
		{
			int i=n-1;
			int j=k;
			while(j<=n-1)
			{
				System.out.print(a[i][j]+" ");
				i--;
				j++;
			}
		}
	}
}
