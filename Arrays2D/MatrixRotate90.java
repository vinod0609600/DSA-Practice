package Arrays2D;
import java.util.*;

// logic 
// array ni 90 deg lo rotate cheyyali, 
// step-1 first array ni transpose cheyyali like {rows-cols,cols-rows}
// ex={
//     1 2 3
//     4 5 6
//     7 8 9
// }
// after transpose ={
//     1 4 7
//     2 5 8
//     3 6 9
// }
// step-2
// reverse every row after transpose
// matix={
//     7 4 1
//     8 5 2
//     9 6 3
// }
// got solution right
public class MatrixRotate90 {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt(); 
            }
        } 
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
