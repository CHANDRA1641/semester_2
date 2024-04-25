package semester_2_as2;
// In a super market each product is having minimum details like prodId, price, quantity
//that is used during the biling process. Keeping this in mind prepare a class named as
//Product having the member variables
//prodId, price, quantity
// a static variable totalPrice
//Initialize the value of product through parameterized constructor. It consists of a
//display() method to display the value of instance variables. A person went to market
//and purchase 5 different products. Using the above mentioned class, display the details
//of products that the person has purchased. Also, determine how much total amount
//the person will pay for the purchase of 5 products

import java.util.Scanner;

public class Product {

     static String prodId;

     static double price;
    int quantity;
    static  double totalprice=0;

    Product(String prodId, double price){
        this.prodId = prodId;
        this.price = price;
        totalprice=totalprice+price;
    }
    public static void display(){
        System.out.println("The Product-ID is : "+prodId+" and the Product Price is : "+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] P = new Product[5];
        String ProdId;
        double Price;
        for(int i = 0; i < P.length; i++) {
            System.out.println("Enter Product-ID and Price of Product : ");
            ProdId = sc.nextLine();
            Price = sc.nextDouble();
            P[i] = new Product(ProdId, Price);
        }

        for(int i = 0; i < P.length; i++) {
            P[i].display();
        }


        System.out.println("Total Amount the person will pay for the purchase of 5 products is : ");



    }

}
