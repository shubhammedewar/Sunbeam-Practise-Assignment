import java.util.*;

public class Q1_max {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Number of elements: ");
        int n = in.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            int k = in.nextInt();
            arr[i] = k;
        }

        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }


        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min] ){
                    min = j;
                }
            }
            int x = arr[i];
            arr[i] = arr[min];
            arr[min] = x;

        }

        System.out.println("Maximum element is:" + arr[n-1]);
        in.close();

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
