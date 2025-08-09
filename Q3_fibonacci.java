import java.util.*;

public class Q3_fibonacci {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();

        int a =0;
        int b =1;
        System.out.print(a + " " +b);
        

        for (int i = 0; i < x-2; i++) {
            int s = a+b;
            System.out.print( " " + s);
            a =b;
            b =s;
        }


        sc.close();
    }
}
