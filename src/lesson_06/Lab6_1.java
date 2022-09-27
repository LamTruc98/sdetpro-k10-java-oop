package lesson_06;

public class Lab6_1 {
    public static void main(String[] args) {
        String value = "2hrs and 5 minutes";
        String[] resultList = value.split(" and");
        int totalMinutes = 0;
        if(resultList.length == 4) {
            totalMinutes = Integer.parseInt(resultList[0]) * 60 + Integer.parseInt(resultList[2]);
        } else {
            totalMinutes = Integer.parseInt(resultList[0]);
        }
        System.out.println(totalMinutes);

    }
}
