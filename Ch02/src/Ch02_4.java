import java.util.Scanner;

public class Ch02_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		if((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2))
			System.out.println("중앙 값은 " + num1);
		if((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1))
			System.out.println("중앙 값은 " + num2);
		if((num1 < num3 && num3 < num2) || (num2 < num3 && num3 < num1))
			System.out.println("중앙 값은 " + num3);
		
		scanner.close();
		
	}
}
