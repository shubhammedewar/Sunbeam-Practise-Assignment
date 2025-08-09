import java.util.Scanner;

public class Q4_marks{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int nSubjects = sc.nextInt();
        int total =0;
        for (int i = 0; i < nSubjects; i++) {
            System.out.print("Enter marks for Subject "+ (i+1) + ": " );
            int m = sc.nextInt();
            total += m;
        }

        if(total >=90 ){
            System.out.print("Grade: Extra Ordinary" );
        }
        else if(90> total && total>=80) System.out.print("Grade : A");
        else if(80> total && total>=70) System.out.print("Grade : B");
        else if(70> total && total>=60) System.out.print("Grade : C");
        else System.out.print("Grade:Fail");


        sc.close();
    }
}