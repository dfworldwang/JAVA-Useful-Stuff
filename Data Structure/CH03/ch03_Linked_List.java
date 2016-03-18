
// Single Linked List

// Step 1: �إ߷s�`�I.
// Step 2: �N�쵲��C��first��last��������VnewNode.
// Step 3: �إߥt�@�ӷs�`�I.
// Step 4: �N��Ӹ`�I��_��: 
//		   last.next = newNode;
//         last = newNode;
// Step 5: �̧ǧ���.

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
			last.next = newNode;		// ���V��s�إߪ�newNode
			last = newNode;
		}
	}
}
