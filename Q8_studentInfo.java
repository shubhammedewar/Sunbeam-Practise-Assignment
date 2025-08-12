import java.util.*;


public class Q8_studentInfo{

    static class student{
        String studentName;
        int marks;
        String rollNo;
        Scanner sc = new Scanner(System.in);
        void setName(){
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
        }

        void setRoll(){
            System.out.print("Enter roll no: ");
            rollNo = sc.nextLine();
        }

        void setMarks(){
            System.out.print("Enter marks: ");
            marks = sc.nextInt();
        }
        
        void display(){
            System.out.println("Name:" + studentName);
            System.out.println("Roll no: " + rollNo);
            System.out.println("Marks: "+ marks);
            
        }

    }

    public static void main(String[] args){
        // Q8_studentInfo outer = new Q8_studentInfo();
        // student s1 = outer.new student();

        student s1 = new student();
        s1.setName();
        s1.setRoll();
        s1.setMarks();
        
        s1.display();
        

    }
}