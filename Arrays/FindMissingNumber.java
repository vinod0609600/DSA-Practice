package Arrays;
import java.util.Scanner;

public class FindMissingNumber {
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n;i++){
            xor1^=arr[i];
            xor2^=(i+1);
        }
        xor2^=N;
        System.out.println(xor1^xor2);
        sc.close();
    }
    
}
