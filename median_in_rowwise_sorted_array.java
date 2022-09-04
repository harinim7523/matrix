package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class median_in_rowwise_sorted_array {
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
		int temp[]=new int[n*n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[k]=a[i][j];
				k++;
			}
		}
		Arrays.sort(temp);
		int m=n*n;
		System.out.println("The median is:"+temp[m/2]);
		
	}
}
