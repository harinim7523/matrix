package matrix;
import java.util.Scanner;
//Square of the diagonals
public class square_of_diagonals {
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
		int temp=0;
		System.out.println("The square of major diagonal");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(a[i][j]*a[i][j]+" ");
					
				}
			}
			
		}
		System.out.println();
		System.out.println("The square of minor diagonal");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n-i-1)
				{
					System.out.print(a[i][j]*a[i][j]+" ");
					
				}
			}
			
		}
		
		
		
	}
}
