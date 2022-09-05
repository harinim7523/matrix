package matrix;

import java.util.Scanner;

public class no_of_islands {
	static int islands(int[][] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==1)
				{
					count+=1;
					calldfs(a,i,j);
				}
			}
		}
		return count;
	}
	static void calldfs(int[][] a,int i,int j) {
		if(i<0 || j<0 || i>=a.length || j>=a[i].length || a[i][j]==0)
		{
			 return;
		}
		a[i][j]=0;
		calldfs(a,i+1,j);
		calldfs(a,i-1,j);
		calldfs(a,i,j+1);
		calldfs(a,i,j-1);
		
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
		System.out.print("The number of islands is : "+islands(a));
	}
}
