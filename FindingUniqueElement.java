
import java.util.*;
public class FindingUniqueElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>Hm=new HashMap<>();
        for(int i=0;i<n;i++){
            Hm.put(arr[i],Hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println("Unique elements");
        for(Map.Entry<Integer,Integer>entryset:Hm.entrySet()){
            if(entryset.getValue()<2){
                System.out.println(entryset.getKey()+" ");
            }
            
        }
        sc.close();
    }
    
}

