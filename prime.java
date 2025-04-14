// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("prime");
            return;
        }
        boolean isprime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
            
        }
        if(isprime){
            System.out.println("prime");
        }else{
            System.out.println("not a prime");
        }
        
    }
}