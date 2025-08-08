import java.util.Scanner;

public class Q2_factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int ans =1;
        for(int i=n;i>0;i--){
            System.out.print(i);
            if(i > 1) System.out.print('*');
            ans = ans * i;
        }
        System.out.println( " = " + ans);
        System.out.println("Factorial of "+n +" is :" +ans );

        sc.close();

    } 
}
