import java.util.concurrent.FutureTask;


// Callable�|���^�ǭ�, �i�f�tFuture�Ө��o�^�ǭ�
// �Q��java.util.concurrent.FutureTask�ӧ���  (FutureTask�OFuture��������@���O)

public class Ch5_FutureInterfaceDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("�е��ڤ@��0 ~ 99�����B�Ʀr !");
		FutureTask<Integer> task = new FutureTask<>(new Lotto());
		new Thread(task).start();
		System.out.println("�p�⤤...");
		System.out.println("�z�����B�Ʀr�O:" + task.get());		
		// Future�o��F���浲�G�N�i�H�Q��get()��k���o
	}
}
