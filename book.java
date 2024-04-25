package semester_2_as2;
//Define a class called Book with instance variables BName, BEdition,
//BPrice. Use constructor to initialize the instance variables of the class.
//Another instance method display ( ) to display the book information. A
//person purchase 5 different books. Display the book details which has
//the maximum price.

public class book {
    String bname;
    String bedition;
    int bprice;
    void book(String bname, String bedition, int bprice){
        this.bname = bname;
        this.bedition = bedition;
        this.bprice  = bprice;
    }
    void display(){
        System.out.println("book name is "+bname);
        System.out.println("book edition is:"+bedition);
        System.out.println("book price is "+bprice);
    }
    public static void main(String[] args) {
        book b1 = new book();
        b1.bname = "ramayan";
        b1.bedition = "valmiki108";
        b1.bprice = 108;
        book b2 =  new book();
        b2.bprice=3002;
        b2.bname = "dfgfg0";
        b2.bedition = "fref";
        book b3 =  new book();
        b3.bprice=3002;
        b3.bname = "dfgfg0";
        b3.bedition = "fref";
        int maxproduct = Math.max(b1.bprice, b2.bprice);
        if (maxproduct == b1.bprice)
            b1.display();
        else
            b2.display();

    }
}
