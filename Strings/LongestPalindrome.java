import java.util.*;
class LongestPalindrome{
    public static String getPalindrome(String s,int p1,int p2){
        int n=s.length();
        while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
            p2++;
            p1--;
        }
        return s.substring(p1+1, p2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        String longest="";
        for(int i=0;i<n;i++){
            String even=getPalindrome(s,i,i+1);
            String odd=getPalindrome(s,i,i);
            if(even.length()>longest.length()) {
                longest=even;
            }
            if(odd.length()>longest.length()) {
                longest=odd;
            }
        }
        System.out.println(longest);

    }

}