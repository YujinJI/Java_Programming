
public class Ch03_13 {
	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			if((i%10==3 || i%10 == 6 || i%10 == 9) && (i/10==3 || i/10==6 || i/10==9)) {
				System.out.println(i+" 박수 짝짝");
			}
			else if(i%10==3 || i%10 == 6 || i%10 == 9) {
				System.out.println(i+" 박수 짝");
			}
			else if(i/10==3 || i/10==6 || i/10==9) {
				System.out.println(i+" 박수 짝");
			}
			
		}
	}
}
