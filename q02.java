package semester_2_as1;

import java.util.Scanner;

//The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
//human body fat in populations. It is computed by taking the individual's weight (mass) in
//kilograms and dividing it by the square of their height in meters. i.e.
//Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)
//(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
//Write a java program by using conditional statement to show the category for a given BMI.
//Category BMI
//Less than 18.5 Underweight
//18.5 to 24.9 Normal Weight
//25.0 to 29.9 Overweight
//30.0 or more Obese
public class q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int height = sc.nextInt();
        double bmi = weight/Math.pow(height,2);
        if (bmi<18.5)
            System.out.println("under weight");
        else if (bmi>18.5 && bmi<24.9)
            System.out.println("normal weight");
        else if (bmi>25 & bmi<29.9)
            System.out.println("over weight");
        else
            System.out.println("obese");

        }
    }

