import java.util.Scanner;

public class Q9_numberConverter {

    static void binary(int n){
        String st = "";
        
        while(n>0){
            int k = n%2;
            st = k+ st;
            n = n/2;
        }
        
        System.out.println("Octal: "+ st);
    }
    static void Octal(int n){
        String st = "";
        
        while(n>0){
            int k = n%8;
            st = k+ st;
            n = n/8;
        }
        
        System.out.println("Octal: "+ st);
    }
    static void hexa(int n){
        String st = "";
        
        while(n>0){
            int k = n%16;
            st = k+ st;
            n = n/16;
        }
        
        System.out.print("Hexadecimal: "+ st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt();
        binary(n);
        Octal(n);
        hexa(n);

        sc.close();
    }
}
