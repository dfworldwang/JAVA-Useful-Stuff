
public class Ch2_Switch_If_Else {

	public static void main(String[] args) {
		
		// �إ� Scanner ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�п�J�N��=> ");
		String code = sc.nextLine();		// ����k�ǻ��ê�^�ثe����J��	  
		System.out.print("�п�J����=> ");
		int height = sc.nextInt(); 			// ����k���y�ثe����J��
		
		switch (code) {
			
			case "Mike":
				if (height >= 170) {
					System.out.println(code + "��������: " + height);
					break;
				} else {
					System.out.println(code + "�ӸG�F");
					break;
				}
			case "Nancy": 
				if (height >= 150) {
					System.out.println(code + "��������: " + height);
					break;
				} else {
					System.out.println(code + "�A�X�ൣ��");
					break;
				}
			default :
				System.out.println("�W�L��H���d��");
				break;
		}
	}
}
