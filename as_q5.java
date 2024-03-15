package semester_2_as1;
//Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix,
//and finds the first row and column with the most 1s.
//Sample run:
//0 0 1 1
//0 0 1 1
//1 1 0 1
//1 0 1 0
//The largest row index: 2
//The largest column index: 2

public class as_q5 {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        for (int i = 0 ;i<4;i++){
            for (int j = 0;j<4;j++){
                arr[i][j]=(int)((Math.random())*2);
            }
        }
        System.out.println("the genrated array is:");
        for (int i = 0 ;i<4;i++){
            for (int j = 0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } System.out.println("The Largest Row Index is : "+largestRow(arr));
        System.out.println("The largest Column Index is : "+largestColumn(arr));

    }
    static int largestRow(int[][] arr){
        int maxRow = 0;
        int max1 = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count > max1){
                max1 = count;
                maxRow = i;
            }
        }
        return maxRow;
    }

    static int largestColumn(int[][] arr){
        int maxColumn = 0;
        int max1 = 0;
        for(int j = 0; j < arr[0].length; j++){
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count > max1){
                max1 = count;
                maxColumn = j;
            }
        }
        return maxColumn;
    }
}
