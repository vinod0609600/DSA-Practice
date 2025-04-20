import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Arrayleader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer>lst=new ArrayList<>();
        int leader=arr[arr.length-1];
        lst.add(leader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=leader){
                leader=arr[i];
                lst.add(leader);
            }

        }
        Collections.reverse(lst);
        for(int i=0;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }

    }
    
}
