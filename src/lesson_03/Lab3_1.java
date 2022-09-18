package lesson_03;

public class Lab3_1 {
    //Count how many odd, even number(s) in an integer array
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int even_count = 0;
        int odd_count = 0;

        /*check each element in the array
         *if its odd, increment odd count
         *else, increment even count
         */
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] %2== 1) {
                odd_count++;

            } else
                even_count++;
        }
        System.out.println("Even numders:" + even_count);
        System.out.println("Odd numders:" + odd_count);
    }
}
