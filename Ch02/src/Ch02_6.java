import java.util.Scanner;

public class Ch02_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		
		int num = scanner.nextInt();
		
		int num1 = num / 10;
		int num2 = num % 10;
		
		System.out.print("박수");
		
		if(num1 == 3 || num1 == 6 || num1 == 9)
			System.out.print("짝");
		if(num2 == 3 || num2 == 6 || num2 == 9)
			System.out.print("짝");
		
		scanner.close();
		
	}
}
