import static java.lang.System.out;

public class Ch05_WaitNotify1 {

	public static void main(String[] args) {
		One one = new One();
		one.start();			// �����: Thread-0
		synchronized(one) {		// �D�����main���oone������	
			
			String tName = Thread.currentThread().getName();
			out.print("one �i�J wait pool ");
			out.println("(" + tName + ")");
			try {
				
				one.wait();		
				// �]�D������i�J wait pool, ��one������]�N�Q����
			} catch (InterruptedException e) {}
			
			out.print("one ���} wait pool ");
			out.println("(" + tName + ")");
			// �D�����main�A�����oone�����ꤧ��, �~�����䥼�������u�@
		}
	}
}

class One extends Thread {
	public void run() {
		synchronized(this) {
			String tName = Thread.currentThread().getName();
			out.print("�I�s notify() ");
			out.println("(" + tName + ")");
			
			notify();
			// ����@�����ݦbone����wait pool�̪������
			out.print("notify() �I�s����! ");
			out.println("(" + tName + ")");
		}
	}
}