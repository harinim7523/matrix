package matrix;
import java.util.Scanner;
public class involutory_matrix {
	static boolean check(int[][] a,int[][] c,int r1,int c1)
	{
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				if(i==j && a[i][j]!=1)
				{
					return false;
					
				}
				if(i!=j && a[i][j]!=0) {
					
						return false;
					
				}
			}
		}
		return true;
	}
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
			boolean ch=check(a,c,r1,c1);
			if(ch==true)
			{System.out.print("Involutory");
				
			}
			else {
				System.out.print("Not Involutory");
			}
			
		
	}
}
