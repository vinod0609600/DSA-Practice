import java.util.*;
public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int cur=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                cur=max;
                max=arr[i];
            }else if(arr[i]>cur && arr[i]<max){
                cur=arr[i];
            }
        }
        System.out.println(cur);
        sc.close();
    }
    
}
