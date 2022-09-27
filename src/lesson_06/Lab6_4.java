package lesson_06;


import java.util.Scanner;

public class Lab6_4 {
    //String url = "https://google.com";
    //Check http OR https; domain name, .com OR .net
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your URL: ");
        String url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        String topLevelDomain = url.split("\\.")[1];
        String subDomain = url.replace("." + topLevelDomain, "");
        subDomain = subDomain.replace(protocol + "://", "");
        System.out.println("Your protocol  is: " + protocol);
        System.out.println("Your subdomain is: " + subDomain);
        System.out.println("Your top-level domain is: ." + topLevelDomain);

    }
}
