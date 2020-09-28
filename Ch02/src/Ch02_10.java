import java.util.Scanner;

public class Ch02_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int radius1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int radius2 = scanner.nextInt();
		
		int dist = ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		if (dist < ((radius1 + radius2) * (radius1 + radius2)))
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 안겹친다.");
		
		scanner.close();
	}
}
