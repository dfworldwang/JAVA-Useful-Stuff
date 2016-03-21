import java.io.IOException;


// �s�`�I���J�Ĥ@�Ӹ`�I���e: �u�ݧ�s�`�I�����Ы��V��C����ӲĤ@�Ӹ`�I, 
// 		�A���C���Э�����s�`�I�W�Y�i.

// �s�`�I���J�̫�@�Ӹ`�I����: �u�ݧ��C���̫�@�Ӹ`�I�����Ы��V�s�`�I, 
//		�s�`�I�A���VNULL�Y�i.

// �s�`�I���J��C��������m: �Ҧp���J���`�I�O�bX�PY����, �u�n�NX�`�I�����Ы��V�s�`�I,
//		�s�`�I�����Ы��VY�`�I�Y�i.

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
			ptr.last = ptr.last.next;		// �@�����i��̫�@�Ӹ`�I
		ptr.last.next = head2.first;
		return head1;
	}
	
	// Insert Node
	public void insert(Node2 ptr)
	{
		Node2 tmp;
		Node2 newNode;
		if (this.isEmpty())					// �p�G��C����
		{
			first = ptr;
			last = ptr;
		}
		else
		{
			if (ptr.next == first)			// ���J�Ĥ@�Ӹ`�I
			{
				ptr.next = first;
				first = ptr;				// �s��first�Optr
			}
			else
			{
				if (ptr.next == null)		// ���J�̫�@�Ӹ`�I
				{
					last.next = ptr;
					last = ptr;				// �s��last�Optr
				}
				else						// ���J�����`�I
				{
					newNode = first;
					tmp = first;
					while (ptr.next != newNode.next)	// �q��C���}�l���i
					{
						tmp = newNode;					
						newNode = newNode.next;
					}
					tmp.next = ptr;				// �e�@�Ӹ`�I���Vptr
					ptr.next = newNode;			// ptr���V��쥻���U�@�Ӹ`�I
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
