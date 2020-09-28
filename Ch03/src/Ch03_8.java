import java.util.Scanner;

public class Ch03_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇개? ");
		int num = scanner.nextInt();
		
		int intArray[] = new int[num];
		
		for(int i=0; i<num; i++) {
			intArray[i] = (int)(Math.random()*100 + 1);
		}
		for(int i=0; i<num; i++)
			System.out.print(intArray[i]+" ");
		scanner.close();
	}
}
