package matrix;

import java.util.Scanner;
//program to print the sum of middle row and middle column
public class sum_of_middle_row_col {
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
		int sumrow=0;
		for(int i=0;i<n;i++)
		{
				sumrow+=a[n/2][i];
			
		}
		int sumcol=0;
		for(int i=0;i<n;i++)
		{
				sumcol+=a[i][n/2];
			
		}
		System.out.println("The middle row sum: "+sumrow);
		System.out.println("The middle column sum: "+sumcol);
	}
}
