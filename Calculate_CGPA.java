
import java.util.Scanner;

public class Calculate_CGPA {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int A,B,C;
        float M,S;
        System.out.println("Enter the first subject marks");
        A= Sc.nextInt();
        System.out.println("Enter the second Subject number");
        B= Sc.nextInt();
        System.out.println("Enter the third Subject number");
        C= Sc.nextInt();
        S=(A+B+C);
        M=S/30;
        System.out.println(M);
    }
    
}
