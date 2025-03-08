
import java.util.Scanner;

public class Add_3_Number {
    public static void main(String[] arr){
        System.out.println("Enter the three number to sum");
        Scanner sc = new Scanner(System.in);
        int A,B,C,S;
        A= sc.nextInt();
        B= sc.nextInt();
        C= sc.nextInt();
        S= (A+B+C );
        System.out.println("The sum of three given number is ");
        System.out.println(S);
        

    }

    
}
