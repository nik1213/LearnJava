
import java.util.Scanner;

// write a java program to convert a string into lower case

public class D6_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to convert into lower case");
// we have taken input from user
        String  A = sc.next();
        String L= A.toLowerCase();
        System.out.println(L);

    }
    
}
