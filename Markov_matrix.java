package matrix;
//Sum of each rows is equal to 1
import java.util.Scanner;

public class Markov_matrix {
	static boolean check(double[][] a,int n)
	{
		double sum;
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=0;j<a[0].length;j++)
			{
				sum=sum+a[i][j];
			}
			if(sum!=1)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		double a[][]=new double[n][n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextDouble();
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
		boolean b=check(a,n);
		if(b==true)
		{
			System.out.println("Markov matrix");
		}
		else {
			System.out.println("Not a Markov matrix");
		}
	}
}
