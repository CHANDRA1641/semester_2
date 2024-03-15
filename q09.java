package semester_2_as1;
/**Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
 values using the following header:
 public static double sumMajorDiagonal(double[][] m)
 Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
 major diagonal.
 Sample Run:
 Enter a 4-by-4 matrix row by row:
 1 2 3 4.0
 5 6.5 7
 9 10 11 12
 13 14 15 16
 Sum of the elements in the major diagonal is 34.
 */

public class q09 {
    public static void main(String[] args) {
       double arr[][] = new double[4][4];
       for (int i =0;i<4;i++)
           for (int j =0;j<4;j++) {
               int count = (int)(Math.random()*9+1);
               arr[i][j]=count;
           }

        for (int i =0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
                ;
            }
            System.out.println();
        }


        System.out.println("the sum of diagonal of matrix is:"+sumd(arr));
    }
    public static double sumd(double m[][]){
        double sum = 0 ;
        for (int i =0;i<4;i++)
            for (int j =0;j<4;j++) {
                if (i==j)
                sum=sum+m[i][j];
            }
        return sum;

    }

}
