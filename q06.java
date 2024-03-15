package semester_2_as1;

import java.util.Scanner;

//
//Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
//method can't use the multiplication, modulus, or division operators
public class q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isodd(n))
            System.out.println("odd");
        else
            System.out.println("even");
    }
    public static boolean isodd(int i){
        while(i>0)

        {  i=i-2;

            if(i==1)

            { break; }

        }

        if(i==1) return true;

        else if(i==-1) return true;

        else return false;

    }
    }


