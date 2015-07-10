
class WithDraw implements Runnable {

	private Account account;			// �b��
	private double withdrawMoney;		// �����ڪ����B
	public WithDraw(Account account, double withdrawMoney) {
		this.account = account;
		this.withdrawMoney = withdrawMoney;
	}
	public void run() {
		account.withDraw(account, withdrawMoney);		// ���洣��
	}
}

class Account {
	private double balance;				// �b��l�B
	public Account(double balance) {
		this.balance = balance;
	}
	
	// ����@�����������withDraw()���ڨ禡���ɭ�, ��L��������o���@balance�o�Ӫ����ܼ�
	// �ߦ��Ӱ�������槹��withDraw()���ڨ禡, �~���\��L��������@balance.
	public synchronized void withDraw(Account account, double withdrawMoney) {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " �}�l���� ... ");
		
		double tmpBalance = balance;
		
		// �� for-loop �������ڮɨt�ΩҪ᪺�ɶ�
		for (double delay = 0; delay < 99999999; delay++);
		
		tmpBalance = tmpBalance - withdrawMoney;
		if (tmpBalance < 0) {
			System.out.println("...........");
			System.out.println(" �b��l�B����!");
			System.out.println("...........");
		}
		else {
			balance = tmpBalance;
		}
		
		System.out.println("�C�L����� : \n �����ڪ��B:" + 
							withdrawMoney + "��, " + 
							"�b��l�B:" + account.checkAccount());
		System.out.println(tName + " �������� ... ");
		System.out.println("-----------------------");
		
	}
	public double checkAccount() {
		return balance;
	}
}

public class Ch5_BankMachine {

	public static void main(String[] args) {
		
		Account ac = new Account(10000);
		System.out.println("�b���l���B: " + ac.checkAccount() + " ��");
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
