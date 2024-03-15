package semester_2_as1;
//Write a java program to check whether a number is a spy number or not.

import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numeber");
        int num = sc.nextInt();
        int sum = 0;
         int prodt= 1;
         int m = num;
         while (m!=0){
             sum=m%10+sum;
             prodt = m%10*prodt;
             m=m/10;
         }
         if (sum == prodt)
             System.out.println("spy number");

    }
}
