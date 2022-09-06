package matrix;

import java.util.Scanner;
//Find if there is a rectangle in binary matrix with corners as 1
public class rectangle_with_corners_1 {
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
		int flag=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;i<n;i++)
			{
				if(a[i][j]==1)
				{
					for(int k=i+1;k<n;k++)
					{
						for(int l=j+1;l<n;l++)
						{
							if(a[i][l]==1 && a[k][j]==1 && a[k][l]==1)
							{
								flag=1;
								break;
							}
						}
					}
				}
					
			}
		}
		if(flag==1)
		{			
			System.out.println("Yes");
			
		}
		else {
			System.out.println("No");
		}
	}
}
