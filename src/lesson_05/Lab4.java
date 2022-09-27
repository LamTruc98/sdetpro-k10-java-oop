package lesson_05;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(new SecureRandom().nextInt(1000));
        myArrayList.add(new SecureRandom().nextInt(1000));
        myArrayList.add(new SecureRandom().nextInt(1000));
        myArrayList.add(new SecureRandom().nextInt(1000));
        myArrayList.add(new SecureRandom().nextInt(1000));
        myArrayList.add(new SecureRandom().nextInt(1000));


        while (isContinuing) {
            printMenu();
            int userOption = getUserOption();
            switch (userOption) {
                case 0:
                    System.out.print("Your number: \t" + new SecureRandom().nextInt(1000));
                    int num = userOption;
                    myArrayList.add(num);
                    break;
                case 1:
                    System.out.println(myArrayList);
                    break;
                case 2:
                    if (myArrayList.size() > 0) {
                        int max = myArrayList.get(1);
                        for (int index = 1; index < myArrayList.size(); index++)
                            if (max < myArrayList.get(index))
                                max = myArrayList.get(index);
                        System.out.println("Maximum value is: \t" + max);
                    }
                    break;

                case 3:
                    if (myArrayList.size() > 0) {
                        int min = myArrayList.get(1);
                        for (int index = 1; index < myArrayList.size(); index++)
                            if (min > myArrayList.get(index))
                                min = myArrayList.get(index);
                        System.out.println("Min value is: \t" + min);
                    } else System.out.println("Empty");
                    break;
                case 4:
                    System.out.println("Miss Search number ");
                    break;
                case 5:
                    isContinuing = false;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n ====SIMPLE MENU====");
        System.out.println("0. Add number into ArrayList");
        System.out.println("1. Print numbers");
        System.out.println("2. Get maximum number");
        System.out.println("3. Get minimum number");
        System.out.println("4. Search number");
        System.out.println("5. Exit ");


    }

    private static int getUserOption() {
        System.out.print("Please input your option: \n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
