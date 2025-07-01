import java.util.*;

public class BuzzNumber {

    public static void main(String[] args) {
        Scanner sc = sc.nextInt();
        String s = sc.next();
        if (s.charAt(s.length()-1) == '7' || Long.parseLong(s)%7==0) {
            System.out.println(s+" is a Buzz Number");
        }
        else System.out.println(s+" is not a Buzz Number");
        sc.close();
    }
}