import java.util.*;
// prob:
// check whether the give string is possible to rotate in the given manner
// ex= abcde => cdeab 
public class StringRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String goal=sc.next();
        if(s.length()!=goal.length()) {
            System.out.println("false");
        }
        String S=s+s;
        if(S.contains(goal)){
           System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
