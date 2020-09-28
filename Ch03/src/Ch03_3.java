import java.util.Scanner;

public class Ch03_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.print("정수를 입력하시오>>");
		
		num = scanner.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num; j>i; j--)
				System.out.print("*");
			System.out.println();
		}
		scanner.close();
	}
}
