package matrix;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class row_and_col_instant_time {
	static void rowmajor(int[][] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]++;
			}
		}
	}
	static void colmajor(int[][] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[j][i]++;
			}
		}
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
		Instant start=Instant.now();
		rowmajor(a,n);
		Instant end=Instant.now();
		System.out.print("The row time is : "+Duration.between(start, end));
		start=Instant.now();
		colmajor(a,n);
		end=Instant.now();
		System.out.print("The column time is : "+Duration.between(start, end));
		
	}
}
