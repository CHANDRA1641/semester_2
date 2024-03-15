package semester_2_as1;
//Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r', 'b', 'o', and 'n' exactly once.
public class q04 {
    public static void main(String[] args) {

        char ch[] = {'c', 'a', 'r'};

        for (int i = 0; i < ch.length; i++) {

            for (int j = 0; j < ch.length; j++) {

                for (int k = 0; k < ch.length; k++) {

                    if (i != j && j != k && i != k) {

                        System.out.println(ch[i] + "" + ch[j] + "" + ch[k]);

                    }

                }

            }

        }
    }}
