package matrix;

import java.util.Scanner;

public class unique_elements {
	static boolean check(int e,int il,int jl,int n,int[][] a)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(e==a[i][j] && i!=il && j!=jl)
				{
					return false;
				}
			}
		}
		return true;
	}
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
		int temp[];
		int k=0;
		int i=0,j=0;
		int s=0;
		for(i=0;i<n;i++)
		{
			boolean c=false;
			for(j=0;j<n;j++)
			{
				s=a[i][j];
				c=check(s,i,j,n,a);
			}
			if(c==true)
			{
				System.out.println(s);
				k=1;
			}
			
		}
		if(k==0)
		{
			System.out.println("No unique elements");
		}
	}
}
