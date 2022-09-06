package matrix;

import java.util.Scanner;

public class print_matrix_zigzag {
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
		int x,y;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				x=i;
				y=0;
				while(y<=i && x>=0)
				{
					System.out.print(a[x][y]+" ");
					x--;
					y++;
				}
				System.out.println();
			}
			else {
				x=0;
				y=i;
				while(x<=i && y>=0)
				{
					System.out.print(a[x][y]+" ");
					x++;
					y--;
				}
				System.out.println();
			}
			
		}
		if(n%2==0)
		{
			for(int i=1;i<n;i++)
			{
				if(i%2!=0)
				{
					x=n-1;
					y=i;
					while(x>=i && y<=n-1)
					{
						System.out.print(a[x][y]+" ");
						x--;
						y++;
					}
					System.out.println();
				}
				else {
					x=i;
				    y=n-1;
				    while(x<=n-1 && y>=i)
				    {
				    	System.out.print(a[x][y]+" ");
				    	x++;
				    	y--;
				    }
				    System.out.println();
				}
			}
			
		}
		else {
			for(int i=1;i<n;i++)
			{
				if(i%2!=0)
				{
					x=i;
				    y=n-1;
				    while(x<=n-1 && y>=i)
				    {
				    	System.out.print(a[x][y]+" ");
				    	x++;
				    	y--;
				    }
				    System.out.println();
					
				}
				else {
					x=n-1;
					y=i;
					while(x>=i && y<=n-1)
					{
						System.out.print(a[x][y]+" ");
						x--;
						y++;
					}
					System.out.println();
				}
			}
		}
	}
}
