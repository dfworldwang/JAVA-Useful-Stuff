import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class ch03_Student_Input_to_Delete_grade {

	public static void main(String args[]) throws IOException
	{
		BufferedReader buf;
		Random rand = new Random();
		buf = new BufferedReader(new InputStreamReader(System.in));
		ch03_Single_Linked_List_Delete_Node list = new ch03_Single_Linked_List_Delete_Node();
		int i, j, findword = 0, find, data[][] = new int[12][10];
		String name[] = new String[] {"Allen", "Scott", "Marry", "Jon", "Mark", "Ricky", "Lisa", "Jasica", "Hanson", "Amy", "Bob", "Jack"};
		System.out.println("座號  成績  座號  成績  座號  成績  座號  成績\n ");
		
		for (i = 0; i < 12; i++)
		{
			data[i][0] = i + 1;
			data[i][1] = (Math.abs(rand.nextInt(50))) + 50;		// 隨機取得0 ~ 50之間的隨機數, 取其絕對值, 再加50
			list.insert(data[i][0], name[i], data[i][1]);
		}
		
		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 4; j++)
			{
				System.out.print("[" + data[j * 3 + i][0] + "] [" + data[j * 3 + i][1] + "] ");	
			}
			System.out.println();
		}
		
		while (true)
		{
			System.out.print("請輸入要刪除成績的座號，結束輸入-1： ");
			findword = Integer.parseInt(buf.readLine());
			
			if (findword == -1)
				break;
			else
			{
				Node current = new Node(list.first.data, list.first.names, list.first.np);
				current.next = list.first.next;
				while (current.data != findword) current = current.next;
				list.delete(current);
			}
			System.out.println("刪除後成績串列，請注意！要刪除的成績其座號必須在此串列中\n");
			list.print();
		}
	}
}
