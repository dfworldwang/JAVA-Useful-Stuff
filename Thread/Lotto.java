import java.util.Date;
import java.util.concurrent.Callable;


// 讓執行緒執行完畢時能有回傳值或拋出例外, 就必須透過實作Callable介面來取代Runnable介面

public class Lotto implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i <= 999999999; i++);		// 模擬要花費的時間
		int number = (int)(Math.random() * 100);
		System.out.println("\t 得到 " + number + " 的時間:" + new Date());
		return number;
	}
}
