import java.util.Scanner;

public class Ch02_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>>");
		
		int num1 = scanner.nextInt();
		String operator = scanner.next();
		int num2 = scanner.nextInt();
		
		if (operator.equals("+"))
			System.out.println(num1 + " + " + num2 + "의 계산결과는 " +(num1+num2));

		if (operator.equals("-"))
			System.out.println(num1 + " - " + num2 + "의 계산결과는 " +(num1-num2));

		if (operator.equals("*"))
			System.out.println(num1 + " * " + num2 + "의 계산결과는 " +(num1*num2));

		if (operator.equals("/"))
			if (num2 == 0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.println(num1 + " / " + num2 + "의 계산결과는 " +(num1/num2));
		scanner.close();
	}
}
