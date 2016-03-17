import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ch02_Matrix_Dimension_Multiplication {

	public static void main(String args[]) throws IOException
	{
		int M, N, P;
		int i, j;
		String strM;
		String strN;
		String strP;
		String tempstr;
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J�x�}A������(M,N): ");
		System.out.print("Please input the M value of Matrix A: ");
		strM = keyin.readLine();
		M = Integer.parseInt(strM);
		System.out.print("Then input the N value of Matrix A: ");
		strN = keyin.readLine();
		N = Integer.parseInt(strN);
		int A[][] = new int[M][N];
		System.out.println("[Please input each element of Matrix A]");
		System.out.println("�`�N! �C��J�@�ӭȫ��UEnter��T�{��J");
		for (i = 0; i < M; i++)
		{
			for (j = 0; j < N; j++)
			{
				System.out.print("a" + i + j + "=");
				tempstr = keyin.readLine();
				A[i][j] = Integer.parseInt(tempstr);
			}
		}
		
		System.out.println("Please input the dimension(N,P) of Matrix B: ");
		System.out.print("Please input the N value of Matrix B: ");
		strN = keyin.readLine();
		N = Integer.parseInt(strN);
		System.out.print("Then input the P value of Matrix B: ");
		strP = keyin.readLine();
		P = Integer.parseInt(strP);
		int B[][] = new int[N][P];
		System.out.println("[Please input each element of Matrix B]");
		System.out.println("�`�N! �C��J�@�ӭȫ��UEnter��T�{��J");
		for (i = 0; i < N; i++)
		{
			for (j = 0; j < P; j++)
			{
				System.out.print("b" + i + j + "=");
				tempstr = keyin.readLine();
				B[i][j] = Integer.parseInt(tempstr);
			}
		}
		int C[][] = new int[M][P];
		MatrixMultiply(A, B, C, M, N, P);
		System.out.println("[The result of AxB:]");
		for (i = 0; i < M; i++)
		{
			for (j = 0; j < P; j++)
			{
				System.out.print(C[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
		
	}
	
	public static void MatrixMultiply(int arrA[][], int arrB[][], int arrC[][], int M, int N, int P)
	{
		int i, j, k, Temp;
		if (M <= 0 || N <= 0 || P <= 0)
		{
			System.out.println("[���~: ����M, N, P�����j��0");
			return;
		}
		for (i = 0; i < M; i++)
		{
			for (j = 0; j < P; j++)
			{
				Temp = 0;
				for (k = 0; k < N; k++)
				{
					Temp = Temp + arrA[i][k] * arrB[k][j];
				}
				arrC[i][j] = Temp;
			}
		}
	}
}
