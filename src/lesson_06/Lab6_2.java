package lesson_06;

import java.util.Scanner;

public class Lab6_2 {
    //String String myPassword = "password123";
    //Allow user to input maximum 3 times
    //Allow user to input maximum 3 times
    public static void main(String[] args) {
        String myPassword = "password123";
        int totalTime = 3;
        try (Scanner scanner = new Scanner(System.in)) {
            while (totalTime > 0) {
                System.out.println("Input your password: ");
                String password = scanner.nextLine();
                if (password.equals(myPassword)) {
                    System.out.println("Welcome");
                } else {
                    totalTime--;
                    System.out.println("password invalid");
                }
            }
        }

        if (totalTime == 0) {
            System.out.println("You have failed 3 times, please try again later");
        }

    }
}
