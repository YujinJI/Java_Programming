import java.util.Scanner;

public class Ch03_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int money;
		
		System.out.print("금액을 입력하시오>>");
		money = scanner.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			System.out.printf("%d원 짜리 : %d개\n", unit[i], money/unit[i]);
			money = money - (money / unit[i] * unit[i]);
		}
		scanner.close();
	}
}
