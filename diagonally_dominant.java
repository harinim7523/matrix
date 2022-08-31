package matrix;

import java.util.*;

public class diagonally_dominant {
	static boolean isdom(int[][] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				sum=sum+Math.abs(a[i][j]);
				sum=sum-Math.abs(a[i][i]);
				if(sum>Math.abs(a[i][i]))
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
		if(isdom(a,n))
		{
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}
}
