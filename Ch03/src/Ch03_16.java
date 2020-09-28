import java.util.Scanner;
public class Ch03_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		String user, computer;
		int n = (int)(Math.random()*3);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		do {
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			if(user.equals("그만")) break;
			computer = str[n];
			if(user.equals("가위")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 비겼습니다"); 
					continue;
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 사용자가 졌습니다");
					continue;
				}
				else if(str[n].equals("보")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 사용자가 이겼습니다");
					continue;
				}
			}
				else if(user.equals("바위")) {
		            if(str[n].equals("가위")) {
		               System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 사용자가 이겼습니다.");
		               continue;
		            }
		            else if(str[n].equals("바위")) {
		               System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 비겼습니다.");
		               continue;
		            }
		            else if(str[n].equals("보")) {
		               System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 사용자가 졌습니다.");
		               continue;
		            }
		         }
		         else if(user.equals("보")) {
		            if(str[n].equals("가위")) {
		               System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 사용자가 졌습니다.");
		               continue;
		            }
		            else if(str[n].equals("바위")) {
		               System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 사용자가 이겼습니다.");
		               continue;
		            }
		            else if(str[n].equals("보")) {
		               System.out.println("사용자 = "+user+" , 컴퓨터 = "+computer+" 비겼습니다.");
		               continue;
		            }
		         }
		         System.out.print("사용자 = "+user+" , 컴퓨터 = "+computer+" ");
		      }while(true);
		      System.out.println("게임을 종료합니다...");
		      scanner.close();				
	}	
}

