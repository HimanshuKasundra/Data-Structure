import java.util.Scanner;
public class Addition
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers of rows");
		int r=sc.nextInt();
		System.out.println("Enter numbers of columns");
        int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter numbers of Elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			    a[i][j]=sc.nextInt();
			}
		}
        System.out.println("array list");
        for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}System.out.println("\n");
		}

		int rr=sc.nextInt();
		System.out.println("Enter numbers of columns");
        int cc=sc.nextInt();
		int b[][]=new int[r][c];
		System.out.println("Enter numbers of Elements");
		for(int i=0;i<rr;i++)
		{
			for(int j=0;j<cc;j++)
			{
			    a[i][j]=sc.nextInt();
			}
		}
        System.out.println("array list");
        for(int i=0;i<rr;i++)
		{
			for(int j=0;j<cc;j++)
			{
				System.out.print(b[i][j]);
				System.out.println(" ");
			}System.out.println("\n");
		}
		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				int add[][]=new int[r][c];
				add[i][j]=a[i][j]+b[i][j];
				System.out.print(add[i][j]);
				System.out.println(" ");
			}System.out.println("\n");
		}
	}
}