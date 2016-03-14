import java.io.IOException;

// Tower of Hanoil
// 1, 將n-1個盤子, 從木樁1移動到木樁2
// 2, 將第n個最大盤子, 從木樁1移動到木樁3
// 3, 將n-1個盤子, 從木樁2移動到木樁3


public class ch01_Tower_of_Hanoil {
	
	public static void main(String args[]) throws IOException
	{
		int j;
		System.out.println("預設4個盤子: ");
		hanoi(4, 1, 2, 3);
	}
	
	public static void hanoi(int n, int p1, int p2, int p3)
	{
		if (n == 1)
			System.out.println("盤子從 " + p1 + " 移到 " + p3);
		else
		{
			hanoi(n - 1, p1, p3, p2);
			System.out.println("盤子從 " + p1 + " 移到 " + p3);
			hanoi(n - 1, p2, p1, p3);
		}
	}
}
