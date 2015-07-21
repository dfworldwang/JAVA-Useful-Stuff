import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


// invokeAll(): 當所有任務完成時, 返回一個Future列表, 各項任務的執行結果皆被封裝在Future物件內

public class Ch5_InvokeAllDemo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("請給我五組0 ~ 99的Lotto數字");
		ExecutorService service = Executors.newCachedThreadPool();
		Collection<Callable<Integer>> list = new ArrayList<>();
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		list.add(new Lotto());
		System.out.println("計算中...");
		// 取得所有回傳的Future物件集合
		List<Future<Integer>> resultList = service.invokeAll(list);
		System.out.print("您的Lotto數字是:");
		for (Future future : resultList) {
			System.out.print(future.get() + " ");
		}
		service.shutdown();
	}
}
