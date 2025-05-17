package Arrays2D;
//   logic 
//   matrix lo first row inka first column boolean array laga use chesa, intiial ga first asl ah first rowzer
//   inka column lo zeros unnayemo store cheskunna oka boolean variabble lo malli last ki zeros unte ah row inka 
//   column ni kudaa zero cheyyadaniki
public class SetMatrixZeross {
    public static void main(String[] args) {
        int matrix[][]={{1,0,1,0},
                        {1,1,1,1},
                        {0,1,1,1},
                        {1,1,1,1}};
       int n=matrix.length;
        int m=matrix[0].length;
        boolean rowzero=false;
        boolean colzero=false;
        for(int i=0;i<m;i++){
            if(matrix[0][i]==0){
                rowzero=true;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                colzero=true;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0|| matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(rowzero){
            for(int i=0;i<m;i++){
                matrix[0][i]=0;
            }
        }
        if(colzero){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
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
