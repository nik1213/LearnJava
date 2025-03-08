import java.util.Scanner;

public class D6_L14_methid_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name;
        name = sc.next(); // we will take input from user 
        System.out.println(name);
        int v=  name.length();
        System.out.println(v); // we will get 6 in out as the length of string is 6 = N I K H I L 
        String Lstring = name.toLowerCase(); // this will change all capital letters to lower case nikhil
        System.out.println(Lstring);
        String Ustring= name.toUpperCase();// it will make all letters in upper case NIKHIL
       
        System.out.println(Ustring);
//---------------------------------------------------------------------------
        String nonTrimmedString= "  Nikhil      ";
        System.out.println(nonTrimmedString);
        //----------------------------------------------
        String trimString = "     Helllllo            ";
        System.out.println(trimString.trim());  // we can use .trim to remove unwanted space added in front or back of string
//---------------------------------------------------------------------------
// if we want to pring string from a specific positon then we can use .substring()
        System.out.println(name.substring(2));// from second it will prinf ex "Nikhil" then it will print "khil"
        System.out.println(name.substring(2, 4));// now it will print from 2nd till 4th in string 
        // example Nikhil = output will be " kh".  String present on end index will not be printed.
        // in case of range the start will print but end will not get printed

//--------------------------------------------------------------------------------
        // if we want to replace any character from string we can use  .replace('the word want to replace', 'the new word ')
        String Replacename= name.replace('N', 'A');       
        // in above line i have replace N with A
        System.out.println(Replacename);
        //-----------------------------------------------------------
// if we want to check that is string starting with our desired character then we can user .startWith("");
        System.out.println(name.startsWith("A"));// we will get answer in boolian form either true or False
        System.out.println(name.startsWith("Nik"));
        //---------------------------------------------------
        // Similarly if we want to check if string end with specific character or not we use .endWith("");
        System.out.println(name.endsWith("H"));// false as output
        System.out.println(name.endsWith("il"));  // true as output
//-----------------------------------------------------------------------------
// if we want to know character value at any specific index then we use .chatAt();
        System.out.println(name.charAt(1)); // for input Nikhil the output will be ' i'
    }
}

// String method operate on java we can file length of string
//String name start with 0,1,2,3,4,,,,,
