import java.util.Scanner;

public class D7_Relationaloperator_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        // we will be writing some code for Hands-on purpose and using relational operators
        if(a==b){ 
            //Checks if two values are equal.
            System.out.println("Both numbers are same. Better Luck next Time!");
        }
        else {
            System.out.println("Good you have entered different numbers!");
        }

        if (a!=b){
            System.out.println("Both numbers are different");

        }
        else{
            System.out.println("both numbers are same");
        }
        if(a>b){// checking a is greaetr then b or not
            System.out.println(a+" is greater then " +b);
            
        }
        else {
            System.out.println(b+ " is greater then "+a);
    
        }
        if(a<b){
            System.out.println(a+" is less then "+b);

        }
        else{
            System.out.println(b+" is less then "+a);
        }
        if(a>=b){
            System.out.println(a+" Nice you have entered a number greater or equab to "+b);

        }
        else{
            System.out.println("you have entered"+a +"less then"+b);
        }
        if(a<=b){
            System.out.println(" you have entered a number" +a+ "less then"+b);
        }
        else{
            System.out.println("you have entered " +a +" grater then" +b);
        }

        








    }
    
    
}
/* Relational operators are used in programming to compare two values or expressions. These operators return a boolean value (true or false) based on whether the condition being evaluated is true or false.

Here are the common relational operators in most programming languages (including Java):

1. Equal to (==)
Description: Checks if two values are equal.
Syntax: a == b
Example: 5 == 5 → true

2. Not equal to (!=)
Description: Checks if two values are not equal.
Syntax: a != b
Example: 5 != 3 → true

3. Greater than (>)
Description: Checks if the left operand is greater than the right operand.
Syntax: a > b
Example: 7 > 3 → true

4. Less than (<)
Description: Checks if the left operand is less than the right operand.
Syntax: a < b
Example: 3 < 7 → true

5. Greater than or equal to (>=)
Description: Checks if the left operand is greater than or equal to the right operand.
Syntax: a >= b
Example: 7 >= 5 → true

6. Less than or equal to (<=)
Description: Checks if the left operand is less than or equal to the right operand.
Syntax: a <= b
Example: 3 <= 5 → true
 */
