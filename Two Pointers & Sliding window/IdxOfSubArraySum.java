import java.util.ArrayList;
import java.util.Scanner;

public class IdxOfSubArraySum {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>lst=subarraySum(arr, target);
        for(int i=0;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer>lst=new ArrayList<>();
        int p1=0;
        int p2=0;
        int sum=0;
        while(p2<=arr.length){
            if(sum<target){
                if(p2==arr.length) break;
                sum+=arr[p2];
                p2++;
            }else if(sum==target){
                lst.add(p1+1);
                lst.add(p2);
                return lst;
                
            }else{
                sum-=arr[p1];
                p1++;
            }
        }
        lst.add(-1);
        return lst;
    }
    
    
}
