import java.util.Date;
import java.util.concurrent.Callable;


// ����������槹���ɯ঳�^�ǭȩΩߥX�ҥ~, �N�����z�L��@Callable�����Ө��NRunnable����

public class Lotto implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i <= 999999999; i++);		// �����n��O���ɶ�
		int number = (int)(Math.random() * 100);
		System.out.println("\t �o�� " + number + " ���ɶ�:" + new Date());
		return number;
	}
}
