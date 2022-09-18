package lesson_03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab3_3 {
    /*
    Sort an integer array from min to max

    Input: {12, 34, 1, 16, 28}
    Expected output: {1, 12, 16, 28, 34}
     */
    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 16, 28};
        /*use sort() method*/
//        Arrays.sort(arr);
//        System.out.println("Sắp xếp giảm dần:" + Arrays.toString(arr));

        /*use for Loop*/
        for (int i = 0; i < arr.length; i++) {
//           System.out.println(arr[i]);

            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;

                }
            }
            System.out.print(arr[i] + "\t");

        }


    }
}
