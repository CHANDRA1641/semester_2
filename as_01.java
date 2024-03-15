package semester_2_as1;
//Write a Java program that takes as input three integers, a, b, and c, from the Java console
//and determines if they can be used in a correct arithmetic formula (in the given order), like
//“a + b = c,” “a = b − c,” or “a b = c.”∗

import java.util.Scanner;

public class as_01 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if (a+b==c||a==b-c||a*b==c)
         System.out.println("yes ,they can be used in a correct arithmetic formula");
   }






}
