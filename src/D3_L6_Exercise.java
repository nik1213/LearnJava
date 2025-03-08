import java.util.Scanner;

public class D3_L6_Exercise {
    public static void main(String[] args) {
        //Scanner is used to enter input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The first subject number");
        int Hindi = sc.nextInt();
        System.out.println("Enter the second subject number");
        int English = sc.nextInt();
        System.out.println("Enter The Third subject number");
        int Maths = sc.nextInt();
        System.out.println("Enter the fourth subject number");
        int Ssc = sc.nextInt();
        System.out.println("Enter fivth subject number");
        int Science = sc.nextInt();
        float S = ( Hindi+English+Maths+Ssc+Science);
        double P = (S/500 * 100);
        System.out.print("The percentage is  ");
        System.out.println(P);



    }
}
