import java.util.concurrent.FutureTask;


// Callable會有回傳值, 可搭配Future來取得回傳值
// 利用java.util.concurrent.FutureTask來完成  (FutureTask是Future介面的實作類別)

public class Ch5_FutureInterfaceDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("請給我一組0 ~ 99的幸運數字 !");
		FutureTask<Integer> task = new FutureTask<>(new Lotto());
		new Thread(task).start();
		System.out.println("計算中...");
		System.out.println("您的幸運數字是:" + task.get());		
		// Future得到了執行結果就可以利用get()方法取得
	}
}
