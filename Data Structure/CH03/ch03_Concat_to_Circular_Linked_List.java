import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

// 環狀鏈結串列.

class ConcatLinkedList extends ch03_Single_Linked_List_Delete_Node
{
	public ch03_Single_Linked_List_Delete_Node concat(ch03_Single_Linked_List_Delete_Node linklist)
	{
		this.last.next = linklist.first;	// 將最後一個節點指標指向串列首
		this.last = linklist.last;			// 新的最後一個節點為目前串列的最後一個節點
		
		return this;
	}
}

public class ch03_Concat_to_Circular_Linked_List {

	public static void main(String args[]) throws IOException
	{
		BufferedReader buf;
		Random rand = new Random();
		buf = new BufferedReader(new InputStreamReader(System.in));
		ConcatLinkedList list1 = new ConcatLinkedList();
		ch03_Single_Linked_List_Delete_Node list2 = new ch03_Single_Linked_List_Delete_Node();
		int i, j, findword = 0, find, data[][] = new int[12][10];
		String name1[] = new String[] { "Allen", "Scott", "Marry", "Jon", "Mark", "Ricky", "Michael", "Tom" };
		String name2[] = new String[] { "Lisa", "Jasica", "Hanson", "Amy", "Bob", "Jack", "John", "Andy" };
		System.out.println("座號  成績  座號  成績  座號  成績  座號  成績\n ");
		
		for (i = 0; i < 8; i++)
		{
			data[i][0] = i + 1;
			data[i][1] = (Math.abs(rand.nextInt(50))) + 50;
			list1.insert(data[i][0], name1[i], data[i][1]);
		}
		
		for (i = 0; i < 2; i++)
		{
			for (j = 0; j < 4; j++)
			{
				System.out.print("[" + data[j + i * 4][0] + "] [" + data[j + i * 4][1] + "] ");				
			}
			System.out.println();
		}
		
		for (i = 0; i < 8; i++)
		{
			data[i][0] = i + 9;
			data[i][1] = (Math.abs(rand.nextInt(50))) + 50;
			list2.insert(data[i][0], name2[i], data[i][1]);
		}
		
		for (i = 0; i < 2; i++)
		{
			for (j = 0; j < 4; j++)
			{
				System.out.print("[" + data[j + i * 4][0] + "] [" + data[j + i * 4][1] + "] ");
			}
			System.out.println();
		}
		
		list1.concat(list2);
		list1.print();
	}
}
