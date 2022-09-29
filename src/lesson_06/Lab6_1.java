package lesson_06;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_1 {
    //Given input string: "84hrs and 5 minutes"
    //Please calculate how many minutes in total
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your time: ");
        String myStrTime = scanner.nextLine();
        String[] splitTime = myStrTime.split(" ");
        int hours = 0, minutes = 0;
        for (int i = 0; i < splitTime.length; i++) {
            if (splitTime[i].contains("hrs")) {
                String spitTimeHour = splitTime[i].replaceAll("[^0-9]", "");
                hours = hours + Integer.parseInt(spitTimeHour);
                minutes = hours * 60;
            }
            if (splitTime[i].equals("minutes")) {
                minutes = minutes + Integer.parseInt(splitTime[i - 1]);
            }
        }
        System.out.printf("Total minutes is: %d ", minutes);


    }
}

