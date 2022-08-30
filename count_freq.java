package matrix;

import java.util.Scanner;
//count frequency of k in a matrix of size n where matrix(i,j)=i+j
//
//2 3 4 5 
//3 4 5 6 
//4 5 6 7
//5 6 7 8
public class count_freq {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[][]=new int[n+1][n+1];
		System.out.println("Enter the element to be searched");
		int k=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				a[i][j]=(i+j);
			}
		}
		System.out.println("The array is:");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		if(n+1>=k)
		{
			System.out.print(k-1);
		}
		else {
			
		}System.out.print(2*n+1-k);
	}
}
