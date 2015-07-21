import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// invokeAny(): 所有任務中只要任何一個任務完成(未拋出異常)就返回結果


public class Ch5_InvokeAnyDemo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("請給我一組0 ~ 99的Lotto數字 !");
		ExecutorService service = Executors.newCachedThreadPool();
		Collection<Callable<Integer>> list = new ArrayList<>();
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		System.out.println("計算中...");
		int result = service.invokeAny(list);
		service.shutdown();
		System.out.println("您的Lotto數字是:" + result);
	}
}
