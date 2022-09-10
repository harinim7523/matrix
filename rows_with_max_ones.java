package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class rows_with_max_ones {
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
		int c,max=0,index=0;
		for(int i=0;i<n;i++)
		{
			c=0;
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==1)
				{
					c++;
				}
			}
			if(c>max)
			{
				max=c;
				index=i;
			}
		}
		System.out.println("The row with max ones is :"+index);
	}
}
