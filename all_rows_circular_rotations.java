package matrix;

import java.util.Scanner;

//To check whether all rows are  circular rotations of each other
public class all_rows_circular_rotations {
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
			
		String str="";
		
		for(int i=0;i<n;i++)
		{
			str=str+'-'+String.valueOf(a[0][i]);
		}
		
		str=str+str;
		int flag=0;
		for(int i=1;i<n;i++)
		{
			String cur="";
			for(int j=0;j<n;j++)
			{
				cur=cur+'-'+String.valueOf(a[i][j]);
			}
			if(!str.contentEquals(cur))
			{
				flag=1;
				break;
				
			}
		}
		if(flag==1)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
