import java.util.Scanner;
import java.util.*;
class BST
{
	Node root;


	class Node
	{
		int data;
		Node left,right;

		Node(int a)
		{
			data=a;
			left=right=null;
		}

	}

	void insert(int a)
	{
		Node nnode=new Node(a);
		if(root==null)
		{
			root=nnode;
		}

		else
		{
			Node temp=root;
			while(temp.left!=null || temp.right!=null )
			{
				if(nnode.data>=temp.data && temp.right!=null)
				{
					temp=temp.right;
				}
				else if(nnode.data<temp.data && temp.left!=null)
				{
					temp=temp.left;
				}
				else
				{
					break;
				}
			}

			if(nnode.data>=temp.data)
			{
				temp.right=nnode;
			}
			else
			{
				temp.left=nnode;
			}
		}
	}

	void display_Inorder()
	{
		if(root==null)
		{
			System.out.println("Empty--------Empty--------Empty ");
		}
		else
		{
			Node temp=root;
			Stack<Node> st=new Stack<Node>();
			while(temp!=null || st.size()>0)
			{
				while(temp!=null)
				{
					st.push(temp);
					temp=temp.left;
				}
				temp=st.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
	}

	void display_Prerder()
	{

	}
}

public class Tree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		BST obj=new BST();
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.insert(9);
		obj.insert(7);
		obj.insert(2);
		obj.insert(1);
		obj.display_Inorder();
	}
}