package semester_2_as2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class datahandling {
    //public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        try{
//            int a ;
//            System.out.println("enter a nuber:");
//            a = sc.nextInt();
//            System.out.println("enter a no.");
//            int b = sc.nextInt();
//            System.out.println(a/b);
//            int arr[]={10,20,30};
//            arr[10]=100;
//            System.out.println("value in arr[10] is "+arr[10]);
//
//        }
//        catch (ArithmeticException  ae){
//            System.out.println(ae);
//            System.out.println("don't enter zero.");
//        }
//        catch (ArrayIndexOutOfBoundsException ae){
//            ae.printStackTrace();
//        }
//        finally {
//            System.out.println("close all the files");
//        }
        //demothrow();

    //    static void demothrow(){
//        try{
//            throw new NullPointerException("demo");
//           // System.out.println("after throw statement ");
//        }catch (NullPointerException ae){
//            System.out.println("catch  inside demo program "+ae);
//            throw ae;//rethrowing the exception object
//        }
//    }
//class ThrowExcep {
//    static void fun()
//    {
//        try {
//            throw new NullPointerException("demo");
//        }
//        catch (NullPointerException e) {
//            System.out.println("Caught inside fun().");
//            throw e; // rethrowing the exception
//        }
//    }
//
//    public static void main(String args[])
//    {
//        try {
//            fun();
//        }
//        catch (NullPointerException e) {
//            System.out.println("Caught in main.");
//        }
//    }
//}
    //Create a class Student having two instance variable name and mark. Enter mark, name of the
    //student. If mark is more than 100, create exception MarksOutOfBoundException & throw it
    //using Java. Display the customised message Mark can’t be greater than 100 for the exception.
    static String name;
    static int mark;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student name:");
        name = sc.next();
        System.out.println("enter student marks:");
        mark = sc.nextInt();
        if (mark < 10 ) {
            throw new java.lang.IndexOutOfBoundsException("fail ho gya bahi");
        }
        else
            System.out.println("your are pass");
    }
}




