package matrix;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//Sort the rows in ascending order and columns in the decending order
public class sort_row_asc_col_des {
	static void sortarray(int[][] a,int n)
	{
		rowsort_asc(a,n);
		transpose(a,n);
		rowsort_des(a,n,false);
		transpose(a,n);
	}
	static void rowsort_asc(int[][] a,int n)
	{
		
		for(int i=0;i<n;i++)
		{
			Arrays.sort(a[i]);
			
		}
	}
	static void rowsort_des(int[][] a,int n,boolean b)
	{
		
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i][j]<a[i][k])
					{
						int temp=a[i][k];
						a[i][k]=a[i][j];
						a[i][j]=temp;
					}
				}
			}
		}
	}
	static void transpose(int[][] a,int n)
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
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
		System.out.println("The array is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sortarray(a,n);
		System.out.println("The array after modification:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
