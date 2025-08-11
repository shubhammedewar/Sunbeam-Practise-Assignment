import java.util.Scanner;

public class Q7_table {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.println("Table of "+"a:" );

        for (int i = 1; i < 11; i++) {
            System.out.println(a +"*" +i+"="+ a*i);
        }

    }
}
