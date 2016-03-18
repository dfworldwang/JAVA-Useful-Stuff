
// Single Linked List

// Step 1: 建立新節點.
// Step 2: 將鏈結串列的first及last指標欄指向newNode.
// Step 3: 建立另一個新節點.
// Step 4: 將兩個節點串起來: 
//		   last.next = newNode;
//         last = newNode;
// Step 5: 依序完成.

class Node
{
	int data;
	int np;
	String names;
	Node next;
	
	public Node(int data, String names, int np)		// Node Constructor.
	{
		this.np = np;
		this.names = names;
		this.data = data;
		this.next = null;
	}
}

public class ch03_Linked_List {

	private Node first;		// the first Node of Linked List
	private Node last;		// the last Node of Linked List
	
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
			last.next = newNode;		// 指向到新建立的newNode
			last = newNode;
		}
	}
}
