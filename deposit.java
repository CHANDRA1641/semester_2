package semester_2_as2;
//. Define a class Deposit. The instance variable of the class Deposit are mentioned
//below.
//1
//Instance Variable Data Type
//Principal Long
//Time Integer
//Rate Double
//TotalAmt Double
//Initialize the instance variables Principal, Time, rate through constructors. Constructors are overloaded with the following prototypes.
//Constructor1: Deposit ( )
//Constructor2: Deposit (long, int, double)
//Constructor3: Deposit (long, int)
//Constructor4: Deposit (long, double)
//Apart from constructor, the other instance methods are
//(i) display ( ): to display the value of instance variables,
//(ii) calcAmt( ): to calculate the total amount.
//totalAamt = Principal + (PrincipalÖrateÖTime)/100;
public class deposit {
    static long principal;
    static int time;
    static double rate;
    static double total_amt;



   public static void deposit(){
        principal = 0;
        time = 0;
        rate = 0;
    }
    public static void Deposit(long amount, int t , double r) {
        principal = amount;
        time = t;
        rate = r;
    }

    public static void Deposit(long amount, int t) {
        principal = amount;
        time = t;
        rate = 1;
    }

    public static void Deposit(long amount, double r) {
        principal = amount;
        rate = r;
        time = 1;
    }

     public void display() {
        System.out.println("Principal amount is : "+principal);
        System.out.println("Time is : "+time);
        System.out.println("Rate is : "+rate);
    }

   public void calc_amt() {
        total_amt = (principal + (principal * rate * time) / 100);
        System.out.println("The Total Amount is : "+total_amt);
    }

    public static void main(String[] args) {
        deposit d1 = new deposit();
        //deposit d2 = new deposit(200656844,44, 3);
        //deposit d3 = new deposit(4000, 2);
        //deposit d4 = new deposit(5000,6.1);
        d1.display();
        d1.calc_amt();
        //d2.display();
       // d2.calc_amt();
        //d3.display();
        //d3.calc_amt();
        //d4.display();
        //d4.calc_amt();
    }
}

