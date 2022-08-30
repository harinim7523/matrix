package matrix;

import java.util.Scanner;
//center element of matrix equals sums of half diagonals
public class center_element_half_diagonal {
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
		int dia1left=0,dia2left=0,dia1right=0,dia2right=0;
		for(int i=0,j=n-1;i<n;i++,j--)
		{
			if(i<n/2)
			{
				dia1left+=a[i][i];
				dia2left+=a[j][i];
			}
			else if(i>n/2){
				dia1right+=a[i][i];
				dia2right+=a[j][i];
			}
		}
		if(dia1left==dia2left && dia2left==dia1right && dia1right==dia2right && dia2right==a[n/2][n/2])
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
