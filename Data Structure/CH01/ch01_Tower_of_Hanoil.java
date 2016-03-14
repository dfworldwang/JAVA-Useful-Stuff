import java.io.IOException;

// Tower of Hanoil
// 1, �Nn-1�ӽL�l, �q���1���ʨ���2
// 2, �N��n�ӳ̤j�L�l, �q���1���ʨ���3
// 3, �Nn-1�ӽL�l, �q���2���ʨ���3


public class ch01_Tower_of_Hanoil {
	
	public static void main(String args[]) throws IOException
	{
		int j;
		System.out.println("�w�]4�ӽL�l: ");
		hanoi(4, 1, 2, 3);
	}
	
	public static void hanoi(int n, int p1, int p2, int p3)
	{
		if (n == 1)
			System.out.println("�L�l�q " + p1 + " ���� " + p3);
		else
		{
			hanoi(n - 1, p1, p3, p2);
			System.out.println("�L�l�q " + p1 + " ���� " + p3);
			hanoi(n - 1, p2, p1, p3);
		}
	}
}
