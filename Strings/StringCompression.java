
import java.util.*;
public class StringCompression{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String compressed="";
        int count=1;
        char curr=S.charAt(0);
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)==curr){
                count++;
            }else{
                compressed=compressed+curr+String.valueOf(count);
                curr=S.charAt(i);
                count=1;
            }
        }
        compressed=compressed+curr+count;
        System.out.println(compressed);
    }
    
}
