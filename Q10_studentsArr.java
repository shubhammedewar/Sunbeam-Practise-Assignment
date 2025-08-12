import java.util.*;

public class Q10_studentsArr {
    public static void main(String[] arg){
        String[] nameOfStudents = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names of students: ");
        for (int i = 0; i <10; i++) { 
            nameOfStudents[i] = sc.nextLine();
        }
        System.out.println("List of students: ");
        for (int i = 0; i <10; i++) { 
            System.out.println(nameOfStudents[i]
);
        }

        sc.close();
    }
}
