import java.util.Scanner;
public class Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers of elements");
		int n=sc.nextInt();
		int a[][]=new int[n];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<n;j++)
			{
				int a[i][j]=sc.nextInt();
				System.out.println("Elements of array"+a[i][j]);
			}
		}
	}
}