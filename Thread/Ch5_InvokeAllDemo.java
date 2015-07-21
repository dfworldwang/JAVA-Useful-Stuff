import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


// invokeAll(): ��Ҧ����ȧ�����, ��^�@��Future�C��, �U�����Ȫ����浲�G�ҳQ�ʸ˦bFuture����

public class Ch5_InvokeAllDemo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("�е��ڤ���0 ~ 99��Lotto�Ʀr");
		ExecutorService service = Executors.newCachedThreadPool();
		Collection<Callable<Integer>> list = new ArrayList<>();
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		System.out.println("�p�⤤...");
		// ���o�Ҧ��^�Ǫ�Future���󶰦X
		List<Future<Integer>> resultList = service.invokeAll(list);
		System.out.print("�z��Lotto�Ʀr�O:");
		for (Future future : resultList) {
			System.out.print(future.get() + " ");
		}
		service.shutdown();
	}
}
