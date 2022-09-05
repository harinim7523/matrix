package matrix;
//move matrix elements in a given direction and add elements with same value
import java.util.*;
public class move_matrix_elements {
	static void movematrix(char d,int n,int[][] a)
	{
	if(d=='l')
	{
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> v=new ArrayList<Integer>();
			ArrayList<Integer> w=new ArrayList<Integer>();
			int j;
			for(j=0;j<n;j++)
			{
				if(a[i][j]!=0)
				{
					v.add(a[i][j]);
				}
			}
			for(j=0;j<v.size();j++)
			{
				if(j<v.size()-1 && v.get(j)==v.get(j+1))
				{
					w.add(2*v.get(j));
					j++;
				}
				else {
					w.add(v.get(j));
				}
			}
			for(j=0;j<n;j++)
			{
				a[i][j]=0;
			}
			j=0;
			for(int k=0;k<w.size();k++)
			{
				a[i][j]=w.get(k);
				j++;
			}
		}
	}
	else if(d=='d')
	{
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> v=new ArrayList<Integer>();
			ArrayList<Integer> w=new ArrayList<Integer>();
			int j;
			for(j=n-1;j>=0;j--)
			{
				if(a[j][i]!=0)
				{
					v.add(a[j][i]);
				}
			}
			for(j=0;j<v.size();j++)
			{
				if(j<v.size()-1 && v.get(j)==v.get(j+1))
				{
					w.add(2*v.get(j));
					j++;
				}
				else {
					w.add(v.get(j));
				}
			}
			for(j=0;j<n;j++)
			{
				a[j][i]=0;
			}
			j=n-1;
			for(int k=0;k<w.size();k++)
			{
				a[j][i]=w.get(k);
				j--;
			}
		}
	}
	
	else if(d=='r')
	{
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> v=new ArrayList<Integer>();
			ArrayList<Integer> w=new ArrayList<Integer>();
			int j;
			for(j=n-1;j>=0;j--)
			{
				if(a[i][j]!=0)
				{
					v.add(a[i][j]);
				}
			}
			for(j=0;j<v.size();j++)
			{
				if(j<v.size()-1 && v.get(j)==v.get(j+1))
				{
					w.add(2*v.get(j));
					j++;
				}
				else {
					w.add(v.get(j));
				}
			}
			for(j=0;j<n;j++)
			{
				a[i][j]=0;
			}
			j=n-1;
			for(int k=0;k<w.size();k++)
			{
				a[i][j]=w.get(k);
				j--;
			}
		}
	}
	else if(d=='u')
	{
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> v=new ArrayList<Integer>();
			ArrayList<Integer> w=new ArrayList<Integer>();
			int j;
			for(j=0;j<n;j++)
			{
				if(a[j][i]!=0)
				{
					v.add(a[j][i]);
				}
			}
			for(j=0;j<v.size();j++)
			{
				if(j<v.size()-1 && v.get(j)==v.get(j+1))
				{
					w.add(2*v.get(j));
					j++;
				}
				else {
					w.add(v.get(j));
				}
			}
			for(j=0;j<n;j++)
			{
				a[j][i]=0;
			}
			j=0;
			for(int k=0;k<w.size();k++)
			{
				a[j][i]=w.get(k);
				j++;
			}
		}
	}
	
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
	System.out.println("Enter a character");
	char d=sc.next().charAt(0);
	System.out.println("The array is:");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	movematrix(d,n,a);
	System.out.println("The array after moving is:");
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
