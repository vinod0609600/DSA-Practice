package Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// logic
// problem:
// An element is a leader if it is strictly greater than all the elements to its right.
// sol:
//     simple thing array ni reverse lo  traverse avvu,intiial ga array last element pakkana m undav 
//     kabatti adhi leader avthadi ,inka next dani kante pedha number edina dorikithe list loki adhi add chey anthe

//     [1,2,12,3,6,5]
//     endhulo mana logic prakaram leaderrs,5,6,12

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
