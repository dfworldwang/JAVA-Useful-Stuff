import java.util.Arrays;
// ぃび来? 尿

public class ch02_Two_dimension_array_Random_numbers {
	
	public static void main(String[] args) {
		// variable announcement
		int intCreate = 1000000;	// 玻ネ睹计Ω计
		int intRand;				// 玻ネRandom number codes
		int[][] intArray = new int[2][42];	// 竚Random number array
		// Place random numbers into array
		while (intCreate-- > 0)
		{
			intRand = (int)(Math.random() * 42);
			intArray[0][intRand]++;
			intArray[1][intRand]++;
		}
		// Sorts the intArray[0] into ascending numerical order.
		Arrays.sort(intArray[0]);
		// т程计せ计腹絏
		for (int i = 41; i > (41 - 6); i--)
		{
			// 硋浪琩Ω计
			for (int j = 41; j >= 0; j--)
			{
				// 讽Ω计才
				if (intArray[0][i] == intArray[1][j])
				{
					System.out.println("睹计腹絏" + (j + 1) + "瞷" + intArray[0][i] + "Ω");
					intArray[1][j] = 0;		// 盢т计盢Ω计耴箂
					break;					// い耞ず癹伴, 膥尿癹伴
				}
			}
		}
	}
}
