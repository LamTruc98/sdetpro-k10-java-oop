package lesson_06;

public class Lab6_3 {
    //String myStr = "100 minutes";
    //NOT using REGEX, extract digit character from that String
    //Expected output: "100".
    //EX: "12345nabc678" -> "12345678"
    public static void main(String[] args) {
        String myStr = "12345nabc678";
        myStr = myStr.replaceAll(",", "");
        String alpha = "";
        String num = "";
        char[] myCharacters = myStr.toCharArray();
        for (char character : myCharacters) {
            if (Character.isDigit(character)) {
                alpha = alpha + character;
            } else {
                num = num + character;
            }
        }

        System.out.println("Output: " + alpha);

    }
}
