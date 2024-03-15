package semester_2_as1;
//Write a Java program that takes two arrays a and b of length n storing int values, and returns
//the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
//for i = 0, . . . , n − 1.

import java.util.Scanner;

public class as2_q3 {
    static int[] dotProduct(int[] A1, int[] A2, int n){
        int[] DotProd = new int[n];
        for(int i = 0; i < n; i++){
            DotProd[i] = A1[i] * A2[i];
        }
        return DotProd;
    } public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] A1 = new int[n];
        int[] A2 = new int[n];
        System.out.println("Enter elements of 1st Array : ");
        for(int i = 0; i < n; i++)
            A1[i] = sc.nextInt();
        System.out.println("Enter elements of 2nd Array : ");
        for(int i = 0; i < n ; i++)
            A2[i] = sc.nextInt();

        System.out.println("The Dot-Product of two Arrays are : ");
        int[] DotProduct = dotProduct(A1, A2, n);
        for(int i = 0; i < n; i++)
            System.out.print(DotProduct[i] + " ");
        System.out.println();
    }
}
