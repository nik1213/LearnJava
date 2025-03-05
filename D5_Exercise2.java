public class D5_Exercise2 {
    public static void main(String[] args) {
        // write a java program to encrype a grade by adding 8 to it. Decript it to show correct grade.
        char grade = 'A';
        grade = (char)(grade+8); // we have typecasted because we are adding char and integer. it will print I on place of A
        System.out.println(grade);
        //To decript this 
        char f = grade;
        f = (char)(grade-8);
        System.out.println(f);
    }
    
}
