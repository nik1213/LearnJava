// write a program to replace space with underscore(_)
import java.util.Scanner;

public class D6_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the String ");
        String A = sc.next();
        // for below string we have given some space
        String C = "  Nikhil     ";
        String B = C.replace(" ", "_"); // we are replacing space with underscore
        System.out.println(B);
    }
}
