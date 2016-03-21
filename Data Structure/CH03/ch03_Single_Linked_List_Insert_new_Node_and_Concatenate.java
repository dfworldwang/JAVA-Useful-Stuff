import java.io.IOException;


// 新節點插入第一個節點之前: 只需把新節點的指標指向串列的原來第一個節點, 
// 		再把串列指標首移到新節點上即可.

// 新節點插入最後一個節點之後: 只需把串列的最後一個節點的指標指向新節點, 
//		新節點再指向NULL即可.

// 新節點插入串列中間的位置: 例如插入的節點是在X與Y之間, 只要將X節點的指標指向新節點,
//		新節點的指標指向Y節點即可.

class Node2
{
	int data;
	Node2 next;
	
	public Node2(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class ch03_Single_Linked_List_Insert_new_Node_and_Concatenate {

	public Node2 first;
	public Node2 last;
	public boolean isEmpty()
	{
		return first == null;
	}
	
	public void print()
	{
		Node2 current = first;
		while (current != null)
		{
			System.out.print("[" + current.data + "]");
			current = current.next;
		}
		System.out.println();
	}
	
	// Concatenate two Linked Lists
	public ch03_Single_Linked_List_Insert_new_Node_and_Concatenate Concatenate(ch03_Single_Linked_List_Insert_new_Node_and_Concatenate head1, ch03_Single_Linked_List_Insert_new_Node_and_Concatenate head2)
	{
		ch03_Single_Linked_List_Insert_new_Node_and_Concatenate ptr;
		ptr = head1;
		while (ptr.last.next != null)
			ptr.last = ptr.last.next;		// 一直推進到最後一個節點
		ptr.last.next = head2.first;
		return head1;
	}
	
	// Insert Node
	public void insert(Node2 ptr)
	{
		Node2 tmp;
		Node2 newNode;
		if (this.isEmpty())					// 如果串列為空
		{
			first = ptr;
			last = ptr;
		}
		else
		{
			if (ptr.next == first)			// 插入第一個節點
			{
				ptr.next = first;
				first = ptr;				// 新的first是ptr
			}
			else
			{
				if (ptr.next == null)		// 插入最後一個節點
				{
					last.next = ptr;
					last = ptr;				// 新的last是ptr
				}
				else						// 插入中間節點
				{
					newNode = first;
					tmp = first;
					while (ptr.next != newNode.next)	// 從串列首開始推進
					{
						tmp = newNode;					
						newNode = newNode.next;
					}
					tmp.next = ptr;				// 前一個節點指向ptr
					ptr.next = newNode;			// ptr指向到原本的下一個節點
				}
			}
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		ch03_Single_Linked_List_Insert_new_Node_and_Concatenate list1 = new ch03_Single_Linked_List_Insert_new_Node_and_Concatenate();
		ch03_Single_Linked_List_Insert_new_Node_and_Concatenate list2 = new ch03_Single_Linked_List_Insert_new_Node_and_Concatenate();
		Node2 node1 = new Node2(5);
		Node2 node2 = new Node2(6);
		list1.insert(node1);
		list1.insert(node2);
		Node2 node3 = new Node2(7);
		Node2 node4 = new Node2(8);
		list2.insert(node3);
		list2.insert(node4);
		list1.Concatenate(list1, list2);
		list1.print();
	}
}
