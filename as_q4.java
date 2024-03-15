package semester_2_as1;
//Write a method to add two matrices. The header of the method is as follows:
//public static double[][] addMatrix(double[][] a, double[][] b)
//In order to be added, the two matrices must have the same dimensions and the same or
//compatible types of elements.

import java.util.Scanner;

public class as_q4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        double arr[][]=new double[a.length][a[0].length];
        for (int i =0;i<a.length;i++){
            for (int j =0;j<a[0].length;j++) {
                arr[i][j] = a[i][j] + b[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and column of array1");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("enter the elements of array1");
        double a[][]= new double[n][m];
        for (int i =0;i< n;i++){
            for (int j =0;j<m;j++) {
               a[i][j] = Math.random()*9+1;
            }
        }
        for (int i =0;i< n;i++){
            for (int j =0;j<m;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the elements of array2");
        double b[][]= new double[n][m];
        for (int i =0;i< n;i++){
            for (int j =0;j<m;j++) {
                b[i][j] =  Math.random()*9+1;
            }
        }
        for (int i =0;i< n;i++){
            for (int j =0;j<m;j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        double add[][]= addMatrix(a,b);
        System.out.println("the add of matrix is:");
        for (int i =0;i< n;i++){
            for (int j =0;j<m;j++) {
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }


    }
}
