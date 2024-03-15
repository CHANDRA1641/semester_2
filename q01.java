package semester_2_as1;
//Write a Java program that can take a positive integer greater than 2 as input and write out the
//number of times one must repeatedly divide this number by 2 before getting a value less
//than 2.

import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number.");
        int n = sc.nextInt();
        int count=0;
        if (n>2){
            while(n>2){
                n=n/2;
                count++;

            }
        }
        System.out.println(count +" times one must repeatedly divide this number by 2 ");

    }
}
