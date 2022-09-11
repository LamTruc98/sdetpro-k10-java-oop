package lab_02;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        // BMI = weight / (height x 2)
        //Underweight = <18.5
        //Normal weight = 18.5 – 24.9
        //Overweight = 25–29.9
        //Obesity = BMI of 30 or greater
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight = ");
        double weight = scanner.nextDouble();

        System.out.print("Height = ");
        double height = scanner.nextDouble();

        double BMI = weight / (height * 2);
        System.out.println("BMI = " + BMI);

        if (BMI <= 18.5) {
            System.out.println("Underweight");
        } else if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("Normal weight");
        } else if (BMI > 25 && BMI < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

    }
}
