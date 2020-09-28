import java.util.Scanner;

public class Ch02_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double radius = scanner.nextDouble();
		
		System.out.print("점 입력>>");
		
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double dist = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
		
		if (dist < radius*radius)
			System.out.println("점 (" + x2 + "," + y2 + ")는 원 안에 있다.");
		else
			System.out.println("점 (" + x2 + "," + y2 + ")는 원 안에 없다.");
		
		scanner.close();
	}
}
