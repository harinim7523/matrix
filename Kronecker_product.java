package matrix;

import java.util.Scanner;

public class Kronecker_product {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array1");
	int r1=sc.nextInt();
	int c1=sc.nextInt();
	System.out.println("Enter the size of the array2");
	int r2=sc.nextInt();
	int c2=sc.nextInt();
	int a[][]=new int[r1][c1];
	int b[][]=new int[r2][c2];
	int c[][]=new int[r1*r2][c1*c2];
	System.out.println("Enter the array elements of array1:");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("The matrix1 is:");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Enter the array elements of array2:");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	System.out.println("The matrix2 is:");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	int m=0;
	int d[]=new int[r1*r1*c1*c2];
	for(int i=0;i<r1;i++)
	{
		for(int k=0;k<r2;k++)
		{
			for(int j=0;j<c1;j++)
			{
				for(int l=0;l<c2;l++)
				{
					d[m]=a[i][j]*b[k][l];
					m++;
				}
			}
		}
	}
	m=0;
	for(int i=0;i<r1*r2;i++)
	{
		for(int j=0;j<c1*c2;j++)
		{
			c[i][j]=d[m];
			m++;
		}
		
	}
	System.out.println("The matrix c is:");
	for(int i=0;i<r1*r2;i++)
	{
		for(int j=0;j<c1*c2;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	}
}

//Enter the size of the array1
//2
//2
//Enter the size of the array2
//2
//2
//Enter the array elements of array1:
//1 2 3 4 
//The matrix1 is:
//1 2 
//3 4 
//Enter the array elements of array2:
//0 5 6 7 
//The matrix2 is:
//0 5 
//6 7 
//The matrix c is:
//0 5 0 10 
//6 7 12 14 
//0 15 0 20 
//18 21 24 28 
