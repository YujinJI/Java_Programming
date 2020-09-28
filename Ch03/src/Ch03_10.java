
public class Ch03_10 {
	public static void main(String[] args) {
		int intArray[][] = new int[4][4];
		int x,y,check=0;
	
		while(check < 10) {
			x = (int)(Math.random()*4);
			y = (int)(Math.random()*4);
			if(intArray[x][y]==0) {
				intArray[x][y] = (int)(Math.random()*9+1);
				check++;
			}
		}
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
