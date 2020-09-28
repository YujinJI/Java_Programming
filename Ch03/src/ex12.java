// 20193036 지유진 

public class ex12 {
   
   public static void main(String[] args) {
      double val[][] = new double[4][];
      val[0] = new double[4];
      val[1] = new double[2];
      val[2] = new double[3];
      val[3] = new double[1];
      
      for (int i = 0; i < val.length; i++)
         for (int j = 0; j < val[i].length; j++)
            val[i][j] = (i + 1) + (0.1)*(j+1);
      for (int i = 0; i < val.length; i++) {
         for (int j = 0; j < val[i].length; j++)
            System.out.print(val[i][j]+" ");
         System.out.println();
      }
   
   }

}
