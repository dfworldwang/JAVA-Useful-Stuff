
// 刪除串列的第一個節點: 只要把串列指標首first指向第二個節點即可.
// first = first.next;

// 刪除串列內的中間節點: 只要將被刪除節點的前一個節點的指標, 指向被刪除節點的下一個節點即可.

// 刪除串列後面的最後一個節點: 只要指向最後一個節點的ptr的指標, 直接指向NULL即可.

//class Node
//{
//	int data;
//	int np;
//	String names;
//	Node next;
//	
//	public Node(int data, String names, int np)
//	{
//		this.np = np;
//		this.names = names;
//		this.data = data;
//		this.next = null;
//	}
//}

public class ch03_Single_Linked_List_Delete_Node {

	public Node first;
	public Node last;
	
	public boolean isEmpty()
	{
		return first == null;
	}
	
	public void print()
	{
		Node current = first;
		while (current != null)
		{
			System.out.println("[" + current.data + " " + current.names + " " + current.np + "]");
			current = current.next;
		}
		System.out.println();
	}
	
	public void insert(int data, String names, int np)
	{
		Node newNode = new Node(data, names, np);
		if (this.isEmpty())
		{
			first = newNode;
			last = newNode;
		}
		else
		{
			last.next = newNode;	// 目前的last指向到newNode
			last = newNode;			// 新的last就是newNode
		}
	}
	
	public void delete(Node delNode)
	{
		Node newNode;
		Node tmp;
		
		if (first.data == delNode.data)			// 刪除第一個節點
		{
			first = first.next;
		}
		else if (last.data == delNode.data)		// 刪除最後一個節點
		{
			System.out.println("I am here\n");
			newNode = first;
			while (newNode.next != last) newNode = newNode.next;
			newNode.next = last.next;	// newNode所指向的下一個節點是last所指向的下一個節點, 即null
			last = newNode;				// 目前新的last就是newNode
		}
		else									// 刪除串列內的中間節點
		{
			newNode = first;
			tmp = first;
			while (newNode.data != delNode.data)
			{
				tmp = newNode;
				newNode = newNode.next;
			}
			tmp.next = delNode.next;
		}
	}
}
