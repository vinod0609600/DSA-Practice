package Arrays;
import java.util.Scanner;

// logic 
// same left rotation lagane but first array ni reverse chestham
// tarwath k elements
// tarwatha n-k elements
// like [1,2,3,4,5] => 2 steps = [4,5,1,2,3]
// approch
// reveerse entire array [5,4,3,2,1] => reversee first k elements [4,5,3,2,1] => reverse n-k elements [4,5,1,2,3]
// we got solution

public class ArrayRotateByK {
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
