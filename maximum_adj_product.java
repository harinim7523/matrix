package matrix;

import java.util.Scanner;

public class maximum_adj_product {
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
		int p=0,max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//for rowwise max
				if(j+3 < n)
				{
					p=a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3];
					if(max<p)
					{
						max=p;
					}
				}
				//for colwise max
				if(i+3 < n)
				{
					p=a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j];
					if(max<p)
					{
						max=p;
					}
				}
				//for major diagonal
				if(i+3 < n && j+3<n)
				{
					p=a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3];
					if(max<p)
					{
						max=p;
					}
				}
				//for minor diagonal
				if(i+3<n && j-3>=0)
				{
					p=a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3];
					if(max<p)
					{
						max=p;
					}
				}
			}
		}
		System.out.print(max);
	}
}
