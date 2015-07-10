
class WithDraw implements Runnable {

	private Account account;			// 帳號
	private double withdrawMoney;		// 欲提款的金額
	public WithDraw(Account account, double withdrawMoney) {
		this.account = account;
		this.withdrawMoney = withdrawMoney;
	}
	public void run() {
		account.withDraw(account, withdrawMoney);		// 執行提款
	}
}

class Account {
	private double balance;				// 帳戶餘額
	public Account(double balance) {
		this.balance = balance;
	}
	
	// 任何一條執行緒執行withDraw()提款函式的時候, 其他執行緒不得維護balance這個物件變數
	// 唯有該執行緒執行完畢withDraw()提款函式, 才允許其他執行緒維護balance.
	public synchronized void withDraw(Account account, double withdrawMoney) {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " 開始提款 ... ");
		
		double tmpBalance = balance;
		
		// 用 for-loop 模擬提款時系統所花的時間
		for (double delay = 0; delay < 99999999; delay++);
		
		tmpBalance = tmpBalance - withdrawMoney;
		if (tmpBalance < 0) {
			System.out.println("...........");
			System.out.println(" 帳戶餘額不足!");
			System.out.println("...........");
		}
		else {
			balance = tmpBalance;
		}
		
		System.out.println("列印交易單 : \n 欲提款金額:" + 
							withdrawMoney + "元, " + 
							"帳戶餘額:" + account.checkAccount());
		System.out.println(tName + " 完成提款 ... ");
		System.out.println("-----------------------");
		
	}
	public double checkAccount() {
		return balance;
	}
}

public class Ch5_BankMachine {

	public static void main(String[] args) {
		
		Account ac = new Account(10000);
		System.out.println("帳戶原始金額: " + ac.checkAccount() + " 元");
		WithDraw s1 = new WithDraw(ac, 5000);
		WithDraw s2 = new WithDraw(ac, 2000);
		WithDraw s3 = new WithDraw(ac, 4000);
		Thread t1 = new Thread(s1, "T1");
		Thread t2 = new Thread(s2, "T2");
		Thread t3 = new Thread(s3, "T3");
		t1.start();
		t2.start();
		t3.start();
	}
}
