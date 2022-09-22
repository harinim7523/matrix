package matrix;
//print the matrix in spiral format
import java.util.Scanner;

public class spiral_print {
	static void printspiral(int[][] a,int t,int b,int l,int r)
	{
		if(a==null || a.length==0 || l>r)
		{
			return;
		}
		for(int i=l;i<=r;i++)
		{
			System.out.println(a[t][i]);
		}
		t++;
		if(t>b)
		{
			return;
		}
		for(int i=t;i<=b;i++)
		{
			System.out.println(a[i][r]);
		}
		r--;
		if(l>r)
		{
			return;
		}
		for(int i=r;i>=l;i--)
		{
			System.out.println(a[b][i]);
		}
		b--;
		if(t>b)
		{
			return;
		}
		for(int i=b;i>=t;i--)
		{
			System.out.println(a[i][l]);
		}
		l++;
		if(l>r)
		{
			return;
		}
		printspiral(a,t,b,l,r);
		
	}
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
		System.out.println("Matrix in spiral format is");
		int top=0,left=0,bottom=a.length-1,right=a[0].length-1;
		printspiral(a,top,bottom,left,right);
	}
}
