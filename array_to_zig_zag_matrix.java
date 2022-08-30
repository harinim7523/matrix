package matrix;

import java.util.Scanner;
//Given an array with 1's 2's ... k's print them in zig zag way.
public class array_to_zig_zag_matrix {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int[] d=new int[] {3,4,2,2,3,1,5};
		
		int k=0;
		for(int i=0;i<r;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<c&&d[k]>0;j++)
				{
					a[i][j]=k+1;
					d[k]--;
					if(d[k]==0)
					{
						k++;
					}
				}
					
			}
			else {
				for(int j=c-1;j>=0&&d[k]>0;j--)
				{
					a[i][j]=k+1;
					d[k]--;
					if(d[k]==0)
					{
						k++;
					}
				}
			}
			
		}
		System.out.println("The array is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
