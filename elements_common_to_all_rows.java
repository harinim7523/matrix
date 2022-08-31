package matrix;

import java.util.Scanner;

//find distinct elements common to all the rows
public class elements_common_to_all_rows {
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
		int temp[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			temp[k]=a[0][i];
			k++;
		}
		for(int i=0;i<n;i++)
		{
			
				System.out.print(temp[i]+" ");
		
			System.out.println();
		}
		int flag,c=0;
		for(int i=0;i<n;i++)
		{
			int e=temp[i];
			int l=0;
			for(int j=1;j<n;j++)
			{
				
				c=0;
				for(int s=0;s<n;s++)
				{
					if(e==a[i][j])
					{
						c++;
					}
					
				}
				
				if(c==0)
				{
					break;
				}
				else {
					l=l+1;
				}
				
			}
			if(l==n-2)
			{
				System.out.println(temp[i]);
			}
		}
	}
}
