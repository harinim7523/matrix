package matrix;

import java.util.Scanner;
import static java.lang.Math.max;
public class maximum_sum_path {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int res=0;
//		for(int i=0;i<m;i++)
//		{
//			res=max(res,a[0][i]);
//		}
		for(int i=1;i<n;i++)
		{
			res=-1;
			for(int j=0;j<m;j++)
			{
				if(j>0 && j<m-1)
				{
					a[i][j]+=max(a[i-1][j],max(a[i-1][j-1],a[i-1][j+1]));
				}
				else if(j>0)
				{
					a[i][j]+=max(a[i-1][j],a[i-1][j-1]);	
				}
				else if(j<m-1)
				{
					a[i][j]+=max(a[i-1][j],a[i-1][j+1]);
				}
				res=max(a[i][j],res);
				
			}
		}
		System.out.println("The maximum path is: "+res);
		
	}
}
