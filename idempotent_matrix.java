package matrix;
import java.util.Scanner;
public class idempotent_matrix {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.println("Enter the array elements of array1:");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Array1 is:");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int c[][]=new int[r1][c1];
		
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					c[i][j]=0;
					for(int k=0;k<c1;k++) {
						c[i][j]+=a[i][k]*a[k][j];
					}
					
				}
				
			}
			System.out.println("The resultant array is:");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			int flag=0;
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					if(a[i][j]!=c[i][j])
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					break;
				}
			}
			if(flag==0)
			{
				System.out.print("Idempotent");
			}
			else {
				System.out.print("Not Idempotent");
			}
	
		
	}
}
