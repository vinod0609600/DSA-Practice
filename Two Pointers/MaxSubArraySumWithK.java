import java.util.HashMap;
import java.util.Scanner;

public class MaxSubArraySumWithK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int max=0;
        int start=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                int len=i-map.get(sum-k);
                if(len>max){
                    max=Math.max(max,len);
                    start=map.get(sum-k)+1;

                }
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println("max subarray length equal to "+k+": "+max);
        System.out.println("max subarray equal to "+k);
        for(int i=start;i<=max;i++){
            System.out.print(arr[i]+" ");

        }
    }
    
}
