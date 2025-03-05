public class D4_L7_operator {
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        int c = 92%a; // we have used module operator and in return we will get the reminder after division
        System.out.println(c);
        System.out.println(a==b); // comparision operator to check is the boh values same or not if same return trus else false
        System.out.println(a>b); 
        System.out.println(a<b);
        // logica operator
        System.out.println(a>b && b>c); // And operator in both are true then the answer is true. If any is false then answer is false
        System.out.println(b>a || c>b); // OR operator , if any one of the condition is true then answer will be true
        

    }
}
/* 1. Arithmetic Operators
Used for basic math operations:

+, -, *, /, % (addition, subtraction, multiplication, division, modulus)
% module operators return reminders.



2. Relational Operators
Used for comparing values, returning true or false:

==, !=, >, <, >=, <= (equal to, not equal to, greater than, less than, etc.)


3. Logical Operators
Used for logical operations (typically in conditions):

&& (AND), || (OR), ! (NOT)


4. Assignment Operators
Used for assigning values to variables:

=, +=, -=, *=, /=, %= (simple and compound assignment)


5. Unary Operators
Operate on a single operand:

+, - (unary plus/minus), ++, -- (increment/decrement), ! (logical NOT)


6. Bitwise Operators
Operate on individual bits:

&, |, ^, ~, <<, >>, >>> (bitwise AND, OR, XOR, NOT, shift operations)


7. Ternary Operator
A shorthand for if-else:

condition ? expr1 : expr2 (evaluates to expr1 if true, otherwise expr2)
These are the main operators in Java that help perform various operations, from arithmetic to logical, comparison, and bitwise operations.

Airthmetic operators don't work with boolian
 */