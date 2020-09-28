
public class Ch03_7 {
	public static void main(String[] args) {
		int intArray[] = new int[10];
		int sum=0;
		
		System.out.print("랜덤한 정수들: ");
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*10 + 1);
			intArray[i] = num;
			System.out.print(num+" ");
		}
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i];
		
		System.out.println();
		System.out.println("평균은 " + (double)sum/intArray.length);
	}
}
