package semester_2_as1;
//Write a Java program that takes all the lines input to standard input and writes them to
//standard output in reverse order. That is, each line is output in the correct order, but the
//ordering of the lines is reversed.

import java.util.Scanner;
import java.util.Stack;

public class as_q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines : ");
        int n = sc.nextInt();
       // sc.nextLine();
        String[] str = new String[n];
        System.out.println("Enter the lines : ");
        for(int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }
        System.out.println("The Reverse Order of each lines are : ");
        for(int i = n - 1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
