import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ch03_User_Input_to_Add_Student_Data_Nodes {

	public static void main(String args[]) throws IOException
	{
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String name;
		int score;
		
		System.out.println("Please input 5 students data: ");
		ch03_Linked_List list = new ch03_Linked_List();
		
		for (int i = 1; i < 6; i++)
		{
			System.out.print("請輸入座號: ");
			num = Integer.parseInt(buf.readLine());
			System.out.print("請輸入姓名: ");
			name = buf.readLine();
			System.out.print("請輸入成績: ");
			score = Integer.parseInt(buf.readLine());
			list.insert(num, name, score);
			System.out.println("-------------");
		}
		
		System.out.println(" Students' Grade: ");
		System.out.println(" Num Name Score =========");
		list.print();
	}
}
