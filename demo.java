package semester_2_as2;

import java.util.Scanner;


public class demo extends haq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of your sales:");
        int price =sc.nextInt();
        if(price>0)
            System.out.println("your commision is :"+getcommision(price));
        else
            System.out.println("price can't be negative.");

    }
}
