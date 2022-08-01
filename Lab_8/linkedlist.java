import java.util.Scanner;
class List
{
	static Node firstelement;
	static class Node
	{
		int data;
		Node next;

		Node(int a)
		{
			data=a;
			next=null;
		}
	}

	public static void insert(int n)
	{
		Node nextnode=new Node(n);
		if(firstelement==null)
		{
			firstelement=nextnode;
		}
		else
		{
			Node temp=firstelement;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=nextnode;
		}
	}



	public static void display()
	{
		Node temp=firstelement;
		if(firstelement==null)
		{
			System.out.println("List is empty");
		}
		while(temp!=null)
		{

			System.out.print(temp.data+"");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void delete()
	{
		if(firstelement==null){
			System.out.println("List is empty");
		}

		if(firstelement.next==null){
			firstelement=null;
		}

		Node secondLast = firstelement;
		Node lastNode = firstelement.next;

		while(lastNode.next!=null){
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}

		secondLast.next=null;
	}
	
}
	




public class linkedlist
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		List obj=new List();
		
		while(true)
		{
			System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit");
			int x=sc.nextInt();
			switch(x)
			{
				case 1:
				System.out.println("Enetr an Element");
				int num=sc.nextInt();
				obj.insert(num);
				break;
				case 2:obj.delete();
				break;
				case 3:obj.display();
				break;
				case 4:System.exit(0);
				break;
				//default:System.out.println("Invalid Inputs");
				//break;
			}
		}
	}
}