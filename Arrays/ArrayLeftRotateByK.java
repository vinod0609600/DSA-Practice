package Arrays;
import java.util.Scanner;

// logic 
// edhi oka juggling algorithm 
// simple nti ante array ni left side rotate cheyyali adhi k steps 
// like 
// [1,2,3,4,5]=> 2 steps left ante [3,4,5,1,2]
//  deniki first 2 elements reverse chey like [2,1]
//  tarwatha remainig elements kuda reverse chey like [5,4,3]
//  now array be like [2,1,5,4,3]
//  eppudu entire array ni rotate chesthe [3,4,5,1,2]
//  we got solution 

public class ArrayLeftRotateByK {
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
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

    

