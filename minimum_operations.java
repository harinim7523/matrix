package matrix;

import java.util.Scanner;
//minimum operations required to make each row and column of matrix equals
public class minimum_operations {
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
		int sumr[]=new int[n];
		int sumc[]=new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sumr[i]+=a[i][j];
				sumc[j]+=a[i][j];
			}
		}
		int maxsum=0;
		for(int i=0;i<n;i++)
		{
			maxsum=Math.max(maxsum,sumr[i]);
			maxsum=Math.max(maxsum,sumc[i]);
		}
		int c=0;
		for(int i=0,j=0;i<n&&j<n;)
		{
			int diff=Math.min(maxsum-sumr[i], maxsum-sumc[j]);
			a[i][j]+=diff;
			c+=diff;
			sumr[i]+=diff;
			sumc[i]+=diff;
			if(sumr[i]==maxsum)
			{
				i++;
			}
			if(sumc[j]==maxsum)
			{
				j++;
			}
		}
		System.out.println("Minimum operations is : "+c);
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
