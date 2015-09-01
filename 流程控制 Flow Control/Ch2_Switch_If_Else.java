
public class Ch2_Switch_If_Else {

	public static void main(String[] args) {
		
		// 建立 Scanner 物件
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("請輸入代號=> ");
		String code = sc.nextLine();		// 此方法傳遞並返回目前的輸入行	  
		System.out.print("請輸入身高=> ");
		int height = sc.nextInt(); 			// 此方法掃描目前的輸入數
		
		switch (code) {
			
			case "Mike":
				if (height >= 170) {
					System.out.println(code + "的身高為: " + height);
					break;
				} else {
					System.out.println(code + "太矮了");
					break;
				}
			case "Nancy": 
				if (height >= 150) {
					System.out.println(code + "的身高為: " + height);
					break;
				} else {
					System.out.println(code + "適合兒童裝");
					break;
				}
			default :
				System.out.println("超過兩人的範圍");
				break;
		}
	}
}
