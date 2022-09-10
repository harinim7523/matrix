package matrix;

import java.util.Scanner;

public class rotate_k_clock {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int loop=0;loop<k;loop++)
		{
		int r=0,c=0;
		int prev=0,curr=0;
		int lastrow=n,lastcol=n;
		while(r<lastrow && c<lastcol)
		{
			if(r+1==lastrow || c+1==lastcol) {
				break;
			}
			prev=a[r+1][c];
			for(int i=c;i<lastcol;i++)
			{
				curr=a[r][i];
				a[r][i]=prev;
				prev=curr;
				
			}
			r++;
			for(int i=r;i<lastrow;i++)
			{
				curr=a[i][lastcol-1];
				a[i][lastcol-1]=prev;
				prev=curr;
				
			}
			lastcol--;
			if(r<lastrow)
			{
				for(int i=lastcol-1;i>=c;i--)
				{
					curr=a[lastrow-1][i];
					a[lastrow-1][i]=prev;
					prev=curr;
				}
			}
			lastrow--;
			if(c<lastcol)
			{
				for(int i=lastrow-1;i>=r;i--)
				{
					curr=a[i][c];
					a[i][c]=prev;
					prev=curr;
				}
			}
			c++;
			
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
	}
}
