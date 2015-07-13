import static java.lang.System.out;

public class Ch05_WaitNotify1 {

	public static void main(String[] args) {
		One one = new One();
		one.start();			// 執行緒: Thread-0
		synchronized(one) {		// 主執行緒main取得one物件的鎖	
			
			String tName = Thread.currentThread().getName();
			out.print("one 進入 wait pool ");
			out.println("(" + tName + ")");
			try {
				
				one.wait();		
				// 因主執行緒進入 wait pool, 而one物件的鎖也將被釋放
			} catch (InterruptedException e) {}
			
			out.print("one 離開 wait pool ");
			out.println("(" + tName + ")");
			// 主執行緒main再次取得one物件的鎖之後, 繼續執行其未完成的工作
		}
	}
}

class One extends Thread {
	public void run() {
		synchronized(this) {
			String tName = Thread.currentThread().getName();
			out.print("呼叫 notify() ");
			out.println("(" + tName + ")");
			
			notify();
			// 喚醒一個隸屬在one物件中wait pool裡的執行緒
			out.print("notify() 呼叫完畢! ");
			out.println("(" + tName + ")");
		}
	}
}