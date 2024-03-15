package semester_2_as1;

import java.util.Scanner;

//Write a java method to calculate the sum of digits of a given number until the number is a
//single digit. The method signature is as follows.
public class q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int  m = num;
        while (m>9) {
            System.out.println(sum(m));
            m = sum(m);
        }

    }public  static int sum(int m ){
        int sum = 0;
        while(m!=0){
            sum+=m%10;
            m=m/10;
        }
        return sum;

    }

}
