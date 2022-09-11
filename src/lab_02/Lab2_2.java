package lab_02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap so n =");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("n la so chan");
        } else {
            System.out.println("n la so le");
        }
    }
}
