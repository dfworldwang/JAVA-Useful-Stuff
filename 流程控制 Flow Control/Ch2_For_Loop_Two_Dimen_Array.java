
// ��J�إߤG���}�C, �A�i�ܤ��㰣3������

public class Ch2_For_Loop_Two_Dimen_Array {

	public static void main(String[] args) {
		
		// �إ� Scanner ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int Array[][] = new int[2][];
		int counter, i = 0;	
		
		System.out.println("��J�Ĥ@���ƥ�=> ");
		int m1 = sc.nextInt();
		Array[0] = new int[m1];
		System.out.println("��J�ĤG���ƥ�=> ");
		int m2 = sc.nextInt();
		Array[1] = new int[m2]; 
		
		System.out.println("��J�Ĥ@���}�C");
		for (counter = 0; counter < m1; counter++) {
			
			System.out.print(" | ");
			Array[0][counter] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("��J�ĤG���}�C");
		for (counter = 0; counter < m2; counter++) {
			
			System.out.print(" | ");
			Array[1][counter] = sc.nextInt();
		}
		
		System.out.println(); 
		
		System.out.println("�ݦU�����ȬO�_��㰣3");
		for (counter = 0; counter < m1; counter++) {
			
			if (Array[0][counter] % 3 == 0) {
				continue;
			}
			System.out.print(Array[0][counter] + "\t");	
		}
		
		System.out.println();
		
		for (counter = 0; counter < m2; counter++) {
			
			if (Array[1][counter] % 3 == 0) {
				continue;
			}
			System.out.print(Array[1][counter] + "\t");
		}
		System.out.println();
	}
}
