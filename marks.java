package semester_2_as2;
//Create an abstract class Marks with three instance variables (markICP, markDSA,
//and percentage) and an abstract method getPercentage(). Create two classes: CSE
//with instance variable algoDesign, and NonCSE with instance variable enggMechanics. Both classes inherit the abstract class Marks and override the abstract method
//getPercentage(). The constructor of class CSE takes the marks in three subjects
//(markICP, markDSA, and algoDesign) as its parameters, and the constructor of class
//NonCSE takes the marks in three subjects (markICP, markDSA, and enggMechanics)
//as its parameters. Create an object for each of the two classes and print the percentage
//of marks for both students.

abstract class mark {
    double markicp;
    double markdsa;
    double percentage;
    void getPercentage(){
    }
    class cse extends mark{
        int algodesign;
        public cse(double markicp,int markdsa,int algodesign){
            this.markicp = markicp;
            this.markdsa = markdsa;
            this.algodesign = algodesign;
        }
        void getpercentage(){
            percentage = (markdsa+markicp+algodesign)/3.0 ;
            System.out.println("percentage of cse student :"+percentage);

        }
    }
    class noncse extends mark{
        int enggmechanics;
        public noncse(double markicp,int markdsa,int enggmechanics){
            this.markicp = markicp;
            this.markdsa= markdsa;
            this.enggmechanics = enggmechanics;
        }
        void getpercentage(){
            percentage = (markdsa+markicp+enggmechanics)/3.0;
            System.out.println("percentage of non cse student :"+percentage);
        }
    }
    public class marks{
        public  void main(String[] args) {
            cse st1 = new cse(20,90,33);
            st1.getpercentage();
            noncse st2 = new noncse(23,44,23);
            st2.getpercentage();

        }


    }

}
