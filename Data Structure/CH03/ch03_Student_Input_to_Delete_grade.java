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
		System.out.println("�y��  ���Z  �y��  ���Z  �y��  ���Z  �y��  ���Z\n ");
		
		for (i = 0; i < 12; i++)
		{
			data[i][0] = i + 1;
			data[i][1] = (Math.abs(rand.nextInt(50))) + 50;		// �H�����o0 ~ 50�������H����, ���䵴���, �A�[50
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
			System.out.print("�п�J�n�R�����Z���y���A������J-1�G ");
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
			System.out.println("�R���ᦨ�Z��C�A�Ъ`�N�I�n�R�������Z��y�������b����C��\n");
			list.print();
		}
	}
}