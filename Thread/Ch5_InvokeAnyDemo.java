import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// invokeAny(): �Ҧ����Ȥ��u�n����@�ӥ��ȧ���(���ߥX���`)�N��^���G


public class Ch5_InvokeAnyDemo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("�е��ڤ@��0 ~ 99��Lotto�Ʀr !");
		ExecutorService service = Executors.newCachedThreadPool();
		Collection<Callable<Integer>> list = new ArrayList<>();
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		System.out.println("�p�⤤...");
		int result = service.invokeAny(list);
		service.shutdown();
		System.out.println("�z��Lotto�Ʀr�O:" + result);
	}
}
