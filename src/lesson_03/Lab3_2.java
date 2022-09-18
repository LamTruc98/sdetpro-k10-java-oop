package lesson_03;

public class Lab3_2 {
    /*Finding maximum value/minimum value from an integer array
    int[] intArr = {1, 2, 3, 4, 5};
    Minimum: 1
    Maximum: 5
     */
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int max = intArr[0];
        int min = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            } else if (intArr[i] < min) {
                min = intArr[i];

            }
        }
        System.out.print("Maximum:" + max + "\n");
        System.out.print("Minimum:" + min);

    }

}
