import java.util.*;

public class Q5_defineInput{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string: ");
        String st = sc.nextLine();

        int upperCnt =0;
        int lowerCnt = 0;
        int numCnt = 0;
        int othCnt = 0;

        int size =st.length();
        int i=0;
        while(i< size){
            int c= st.charAt(i);
            
            if(c >=65 && c<=91 ) upperCnt++;
            else if( c >= 97 && c<= 122) lowerCnt++;
            else if(Character.isDigit(c)) numCnt++;
            else othCnt++;
            i++;
        }

        System.out.println("Upper Char:" + upperCnt);
        System.out.println("Lower Char:" + lowerCnt);
        System.out.println("Digits:" + numCnt);
        System.out.print("Other Char:" + othCnt);

        sc.close();
    }
}