package semester_2_as2;
// Define an interface DetailInfo to declare methods display( ) & count( ). Another class
//Person contains a static data member maxcount, instance member name & method
//display( ) to display name of a person, count the no. of characters present in the name
//of the person.

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class detailinfo {

    int maxcount;
   static String name;



   static class person extends detailinfo {

       public person(String name ){
           this.name = name;
       }
       void count(@NotNull String name){
           int maxcount =0;
           this.name = name;
           for(int i =0;i<name.length();i++){
               maxcount++;
           }
           System.out.println(maxcount);

       } void  display(){
           System.out.println("person name is :"+name);


       }


   }

    public static void main(String[] args) {
        person p1 = new person("chandra raj prasad");
        p1.display();
        Scanner sc = new Scanner(System.in);
        p1.count("chandra raj prasad");
        String name  = sc.nextLine();
        person p2  = new person(name);
        p2.display();
        p2.count(name);

    }


}


