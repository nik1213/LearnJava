import java.util.Scanner;


public class KM_to_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance to be converted to miled from kilometer");
        int A = sc.nextInt();
        double B = 0.62;
        double Mile= (A*B);
        System.out.println("the converted distance from KM to miles is " +Mile );


    }
}
