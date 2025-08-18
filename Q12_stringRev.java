import java.util.*;

public class Q12_stringRev {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int n = str.length();
        
        char[] ch = str.toCharArray();

        int s=0, e= n-1;
        
        while(s<e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;

            s++;
            e--;
        }

        String reversed = new String(ch);

        System.out.println("Original: " + str);
        System.out.print("Reversed string: " + reversed);

        sc.close();
    }
}
