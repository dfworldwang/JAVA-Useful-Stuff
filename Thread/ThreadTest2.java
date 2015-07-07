
public class ThreadTest2 {
	
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread();
		t1.setName("T1");			// 設定執行緒名稱
		t1.start();
		System.out.println("可用執行緒 : " + Thread.activeCount() + " 條");
		// 計算出目前系統中可用的執行緒數量
	}
}
