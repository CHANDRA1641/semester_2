package semester_2_as2;
//A sales person is paid commission based on the sales he makes as shown
//by the following table:
//SALES COMMISSION
//Under Rs. 100 --2% of SALES
//Rs 500 and under Rs 5000 --5% of Sales
//Rs 5000 and above --8% of sales
//Write a class, Commission, which has:
//An instance variable, sales; an appropriate constructor; and a method,
//getCommission() that returns the commission.
//Now write a Demo class in Java to test the Commission class by reading a sale from the user, using it to create a Commission object after
//validating that the value is not negative. Finally, call the getcommission() method to get and print the commission.
//If the sales are negative, your Demo class should print the message
//“Invalid Input”.

public class haq1 {
    public  class commision{
        int sales;
        double commision;

    }
    public static double getcommision(int price){
       if (price<100)
           return price*2/100;
       else if (price<5000) {
           return price*5/100;
       } else  {
           return price*8/100;
       }
    }


    public static void main(String[] args) {

    }
}
