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

	public void shortLL(){
		Node temp=firstelement;
		int c=0;
		int d;
		while(temp!=null){
			temp=temp.next;
			c++;
		}
		Node temp1;
		Node temp2;

		for(int i=0;i<c;i++){
			temp1=firstelement;
			temp2=temp1.next;
			for(int j=0;j<c-1;j++){
				if(temp2.data<temp1.data){
					d=temp1.data;
					temp1.data=temp2.data;
					temp2.data=d;
				}
				temp1=temp2;
				temp2=temp2.next;
			}
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
	
public class Sortlinkedlist
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		List obj=new List();
		
		while(true)
		{
			System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit\n5.shortlist");
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
				case 5:obj.shortLL();
				break;
				//default:System.out.println("Invalid Inputs");
				//break;
			}
		}
	}
}