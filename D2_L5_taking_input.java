import java.util.Scanner;
// we need to import Scanner if we want to take input from user.


public class D2_L5_taking_input {
    public static void main(String[] arr){
        System.out.println("it works");
        Scanner sc= new Scanner(System.in);

/*      the below all line are marked as comment statement.
 // the above systax is used to take input from keyboad and user
        // to create an instance for class
        
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        // to take first input from user
//        int a = sc.nextFloat()  if i want to enter float as input from user
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        // to take second input from user
        int Sum= a+b;
        // float Sum = a+d;   i want to add two float data type
        System.out.println("the sum of the number is ");
        System.out.println(Sum);
*/

    boolean b1 = sc.hasNextInt();
    System.out.println(b1);
    }
}
