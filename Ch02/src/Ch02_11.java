import java.util.Scanner;

public class Ch02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		
		int month = scanner.nextInt();
		
		if(month > 12 && month < 1)
			System.out.println("잘못입력");
		
		else if (month >= 3 && month <= 5)
			System.out.println("봄");
		else if (month >= 6 && month <= 8)
			System.out.println("여름");
		else if (month >= 9 && month <= 11)
			System.out.println("가을");
		else 
			System.out.println("겨울");
		
		scanner.close();
	}
}
